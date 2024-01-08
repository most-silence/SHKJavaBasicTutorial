package chapter08;

import java.util.Scanner;

/*
enum 关键字声明枚举
类的对象数量可以确定，就可以使用枚举类，如果对象只有一个则是单例
【修饰符】 enum 枚举类名{
    常量对象列表
}

【修饰符】 enum 枚举类名{
    常量对象列表;

    对象的实例变量列表;
}
 */
 enum Week{
    MONDAY("星期一"),
    TUESDAY("星期二"),
    WEDNESDAY("星期三"),


    THURSDAY("星期四"),
    FRIDAY("星期五"),
    SATURDAY("星期六"),
    SUNDAY("星期日");

    private final String description;

    private Week(String description){
        this.description = description;
    }

    @Override
    public String toString() {
        return super.toString() +":"+ description;
    }
}
enum SeasonEnum {
    SPRING("春天","春风又绿江南岸"),
    SUMMER("夏天","映日荷花别样红"),
    AUTUMN("秋天","秋水共长天一色"),
    WINTER("冬天","窗含西岭千秋雪");

    private final String seasonName;
    private final String seasonDesc;

    private SeasonEnum(String seasonName, String seasonDesc) {
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }
    public String getSeasonName() {
        return seasonName;
    }
    public String getSeasonDesc() {
        return seasonDesc;
    }


    @Override
    public String toString() {
        return super.toString() +":"+ seasonName + " " + seasonDesc;
    }
}
public class EnumTest1 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        SeasonEnum spring  = SeasonEnum.SPRING;
        System.out.println(spring);
        System.out.println("------------------------");
        Week[] values = Week.values();
        for (Week value : values) {
            System.out.println((value.ordinal() + 1) + "->" + value.name());

        }
        System.out.println("------------------------");

        Scanner input = new Scanner(System.in);
        System.out.println("请输入星期几：");
        int weekValue = input.nextInt();
        Week week = values[weekValue - 1];
        System.out.println(week);

    }
}

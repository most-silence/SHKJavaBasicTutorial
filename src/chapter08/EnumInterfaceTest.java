package chapter08;
/*
实现接口的枚举类
• 和普通 Java 类一样，枚举类可以实现一个或多个接口
• 若每个枚举值在调用实现的接口方法呈现相同的行为方式，则只要统一实现该方法即
可。
• 若需要每个枚举值在调用实现的接口方法呈现出不同的行为方式，则可以让每个枚举
值分别来实现该方法
语法：
//1、枚举类可以像普通的类一样，实现接口，并且可以多个，但要求必须实现里面所
有的抽象方法！
enum A implements 接口 1，接口 2{
 //抽象方法的实现
}

//2、如果枚举类的常量可以继续重写抽象方法!
enum A implements 接口 1，接口 2{
    常量名 1(参数){
        //抽象方法的实现或重写
    },
    常量名 2(参数){
        //抽象方法的实现或重写
    },
    //...
}
 */
public class EnumInterfaceTest {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }
}
interface Info{
    void show();
}
enum Season1 implements Info{
    //1. 创建枚举类中的对象,声明在 enum 枚举类的首位
    SPRING("春天","春暖花开"){
        public void show(){
            System.out.println("春天在哪里？");
        }
    },
    SUMMER("夏天","夏日炎炎"){
        public void show(){
            System.out.println("宁静的夏天");
        }
    },
    AUTUMN("秋天","秋高气爽"){
        public void show(){
            System.out.println("秋天是用来分手的季节");
        }
    },
    WINTER("冬天","白雪皑皑"){
        public void show(){
            System.out.println("2002 年的第一场雪");
        }
    };
    //2. 声明每个对象拥有的属性:private final 修饰
    private final String SEASON_NAME;
    private final String SEASON_DESC;

    //3. 私有化类的构造器
    private Season1(String seasonName,String seasonDesc){
        this.SEASON_NAME = seasonName;
        this.SEASON_DESC = seasonDesc;
    }

    public String getSEASON_NAME() {
        return SEASON_NAME;
    }

    public String getSEASON_DESC() {
        return SEASON_DESC;
    }
}
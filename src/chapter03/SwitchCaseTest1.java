package chapter03;
/*
if else对于选择比较短的使用
switch 和break联用达到高效率的if else
同时switch拥有穿透性，从上到下依次执行
 */
public class SwitchCaseTest1 {
    public static void main(String[] args) {
        int grade = 60;
        int num = grade / 10;
        switch (num){
            case 10 :
                System.out.println("合格");
                break;
            case 9:
                System.out.println("合格");
                break;
            case 8:
                System.out.println("合格");
                break;
            case 7 :
                System.out.println("合格");
                break;
            case 6:
                if(grade == 60){
                    System.out.println("刚好及格！");
                    break;
                }
                System.out.println("合格");
                break;
            default:
                System.out.println("不及格");
        }
    }
}

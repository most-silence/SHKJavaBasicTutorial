package chapter03;


public class SwitchCaseTest{
    public static void main(String[] args){
        int num = 1;
        switch (num) {
            case 0:
                System.out.println("zero");
                break;
        
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            default:
                System.out.println("other");
                break;
        }
    }
}

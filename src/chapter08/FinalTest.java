package chapter08;

public class FinalTest  {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }
}

final class Eunuch{ //太监

}
//error
//class Son extends Eunuch{
//
//}

class FatherFinal{
    public final void method(){
        System.out.println("father");
    }
}
class SonFinal extends FatherFinal{
    //public void method(){
    //    System.out.println("father");
    //}
}

final class Test{
    public static int totalNumber  = 5;
    public final int ID;
    public Test(){
        ID  =++totalNumber;
    }
    public static void main(String[] args){
        Test test = new Test();
        System.out.println(test.ID);
    }
}


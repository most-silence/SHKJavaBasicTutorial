package chapter08;

public class CodeBlockExercise2 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        new Leaf();
    }
}

class Root{
    {
        System.out.println("Root Instance Block");
    }
    static{
        System.out.println("Root Static Block");
    }


    public Root(){
        System.out.println("Root Constructor without parameter");
    }

}

class Mid extends Root{
    static{
        System.out.println("Mid Static Block");
    }
    {
        System.out.println("Mid Instance Block");
    }
    public Mid(){
        System.out.println("Mid Constructor without parameter");
    }
    public Mid(String msg){
        //通过 this 调用同一类中重载的构造器
        this();
        System.out.println("Mid 的带参数构造器，其参数值："
                + msg);
    }

}

class Leaf extends Mid{
    static{
        System.out.println("Leaf Static Block");
    }
    {
        System.out.println("Leaf Instance Block"); //????? 为什么先mid构造
    }
    public Leaf(){
        //通过 super 调用父类中有一个字符串参数的构造器
        super("尚硅谷");
        System.out.println("Leaf 的构造器");
    }
}
package chapter08;

/*
成员内部类的使用特征，概括来讲有如下两种角色：
• 成员内部类作为类的成员的角色：
– 和外部类不同，Inner class 还可以声明为 private 或 protected；
– 可以调用外部类的结构。（注意：在静态内部类中不能使用外部类的非静态
成员）
– Inner class 可以声明为 static 的，但此时就不能再使用外层类的非 static 的
成员变量；
• 成员内部类作为类的角色：
– 可以在内部定义属性、方法、构造器等结构
– 可以继承自己的想要继承的父类，实现自己想要实现的父接口们，和外部
类的父类和父接口无关
– 可以声明为 abstract 类 ，因此可以被其它的内部类继承
– 可以声明为 final 的，表示不能被继承
– 编译以后生成 OuterClass1$InnerClass.class 字节码文件（也适用于局部内部
类）
注意点：
• 外部类访问成员内部类的成员，需要“内部类.成员”或“内部类对象.成员”的方式
• 成员内部类可以直接使用外部类的所有成员，包括私有的数据
• 当想要在外部类的静态成员部分使用内部类时，可以考虑内部类声明为静态的
 */
public class InnerClassTest {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
    OuterClass1.StaticInner staticInner = new OuterClass1.StaticInner();
    staticInner.inFun();
    System.out.println("--------------------------");
    OuterClass1 OuterClass1 =  new OuterClass1();
    OuterClass1.NoStaticInner staticInner2 = OuterClass1.new NoStaticInner();
    //staticInner2.inFun();
        OuterClass1.outFun();
    }
}
class OuterClass1{
    private static String a = "OuterClass1 static member: a";
    private static String b = "OuterClass1 static member: b";
    private  String c = "OuterClass1 non-static member: c";
    private  String d = "OuterClass1 non-static member: d";

    public static void outFun(){
        //NoStaticInner  staticInner = new NoStaticInner();
        //staticInner.inFun();

    }
    static class StaticInner{
        private static String a = "StaticInnerClass static member: a";
        private String c = "StaticInnerClass non-static member: c";
        public static void inMethod(){

        }
        public void inFun(){
            System.out.println("Inner.inFun");
            System.out.println("OuterClass1.a = " + OuterClass1.a);
            System.out.println("StaticInnerClass.a = " + a);
            System.out.println("b = " + b);
            System.out.println("c = " + c);

        }
    }
    class NoStaticInner{
        private  String a = "NoStaticInnerClass non-static member: a";
        private String c = "NoStaticInnerClass non-static member: c";
        public void inFun(){
            System.out.println("Inner.inFun");
            System.out.println("OuterClass1.a = " + OuterClass1.a);
            System.out.println("NoStaticInnerClass.a = " + a);
            System.out.println("b = " + b);
            System.out.println("c = " + c);

        }
    }

}

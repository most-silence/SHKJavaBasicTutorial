package chapter08;

public class InnerClassExercise1 {
    public  InnerClassExercise1() {
        Inner s1 = new Inner();
        s1.a = 10;
        Inner s2 = new Inner();
        s2.a = 20;
        InnerClassExercise1.Inner s3 = new InnerClassExercise1.Inner();
        System.out.println(s3.a);
    }
    class Inner {
        public int a = 5;
    }
    public static void main(String[] args) {
        InnerClassExercise1 t = new InnerClassExercise1();
        Inner r = t.new Inner();
        System.out.println(r.a);
    }
}

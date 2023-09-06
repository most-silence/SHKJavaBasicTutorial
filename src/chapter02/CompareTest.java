package chapter02;
/*
1. == != > < >= <= instanceof

2.
- instanceof 在面向对象多态的地方讲解
- == != < > 适用于除了boolean类型之外的7种基本数据类型
- == !=也可能使用一些类的，比如String等引用数据类型
*/

public class CompareTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int m1 = 10;
        int m2 = 20;
        boolean compare1 = m1 > m2;
        System.out.println(compare1);

        int n1 = 10;
        int n2 = 20;
        System.out.println(n1 == n2);
        // Error prone
        System.out.println(n1 = n2);

        boolean b1 = false;
        boolean b2 = true;
        System.out.println(b1 = b2);

    }
}

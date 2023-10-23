package chapter07;

class Student {
    private String name;
    private  int age;
    //**The n construstor with n - 1 this()**

    //No parameter
    public Student(){
        // Must with paremeter, otherwise recursive constructor invocation
        //this("张三", 18);
    }

    // With parameter
    public Student(String name, int age){
        this();
        this.age = age;
        this.name = name;
    }
}


public class ThisTest {
    public static void main(String[] args) {
        Student student = new Student("zhangsan", 18);
        System.out.println("Constructor calling another Constructor");


    }
}

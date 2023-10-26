package chapter07;

public class FinalizeTest {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
    Person1 p1 = new Person1("Peter", 12);
    System.out.println(p1);
    p1 = null;
    System.gc();
    }
}

class Person1{
    private String name;
    private int age;

    public Person1(String name, int age){
        super();
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }

    @Override
    protected void finalize() throws Throwable{
        System.out.println("Object is being released------>" + this);
    }

    @Override
    public String toString(){
        return "Person1 [name=" + name + ", age=" + age +"]";
    }
}
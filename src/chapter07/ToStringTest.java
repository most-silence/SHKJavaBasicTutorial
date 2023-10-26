package chapter07;

public class ToStringTest {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
    Person p1 = new Person();
    System.out.println(p1);

    Circle circle = new Circle();
    System.out.println(circle);
    }
}
class Person{
    private String name;
    private int age;

    @Override
    public String toString(){
        return "Person{" + "name='" + name + '\'' + ", age=" + age + '}';
    }
}

class GeometricObjcet{
    protected String color;
    protected double weight;

    protected GeometricObjcet(){
        color = "white";
        weight = 1.0;
    }
    protected GeometricObjcet(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }
}

class Circle extends GeometricObjcet{
    private double radius;

    public Circle(){
        radius = 1.0;
    }

    @Override
    public String toString(){
        return "Circlr{color weight radius\n" + this.color + " " + this.weight
                + " " + this.radius + "}";

    }
}
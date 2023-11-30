package chapter08;

public class InterfaceExecise3 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Developer developer = new Developer();
        Vechicle[] vechicles = new Vechicle[3];
        vechicles[0] = new Bycicle("凤凰牌", "红色");
        vechicles[1] = new ElectricVechicle("小鹏", "黄色");
        vechicles[2] = new Car("上海大众", "黑色","123456");
        developer.takingVechicle(vechicles[0]);
        developer.takingVechicle(vechicles[1]);
        developer.takingVechicle(vechicles[2]);
    }
}

abstract class Vechicle{
    private String brand;
    private String color;

    public Vechicle(){

    }

    public String getBrand(){
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public abstract void run();
}
interface IPower{
    void power();
}

/*******实现类*********/
class Bycicle extends Vechicle{
    public Bycicle(String brand, String color){
        super();
        super.setBrand(brand);
        super.setColor(color);
    }
    public void run(){
        System.out.println("Bycicle run");
    }
}

class ElectricVechicle extends Vechicle implements IPower{
    public ElectricVechicle(String brand, String color){
        super();
        super.setBrand(brand);
        super.setColor(color);
    }

    //exact abstract func
    public void run(){
        System.out.println("ElectricVechicle run");
        this.power();
    }

     public void power(){
         System.out.println("ElectricVechicle 充电");
    }
}

class Car extends Vechicle implements IPower{
    private String carNumber;

    public Car(String brand, String color, String carNumber){
        super();
        super.setBrand(brand);
        super.setColor(color);
        this.carNumber = carNumber;
    }
    public String getCarNumber(){
        return this.carNumber;
    }
    public void setCarNumber(String carNumber){
        this.carNumber = carNumber;
    }


    //exact abstract func
    public void run(){
        System.out.println("Car run");
        this.power();
    }

    public void power(){
        System.out.println("Car 加油");
    }
}
class Developer {
    private String name;
    private int age;

    public String getName(){
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }

    public void takingVechicle(Vechicle vechicle){
        System.out.println("使用交通工具");
        vechicle.run();
    }

}


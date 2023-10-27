package chapter08;

/*
• 不能用 abstract 修饰变量、代码块、构造器；
• 不能用 abstract 修饰私有方法、静态方法、final 的方法、final 的类。
 */
public class AbstractTest {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }
}

abstract class Vechicle{
    public abstract double calcFuelEfficiency();

    public abstract double calcTripDistance();
}

class Truck extends Vechicle {
    public double calcFuelEfficiency(){
        return 0;
    }

    public double calcTripDistance() {
        return 0;
    }
}
class RiverBarge extends Vechicle{
    public double calcFuelEfficiency(){
        return 0;
    }

    public double calcTripDistance() {
        return 0;
    }

}
package chapter08;
/*
[修饰符] interface 接口名{
    //接口的成员列表：
    // 公共的静态常量
    // 公共的抽象方法

    // 公共的默认方法（JDK1.8 以上）
    // 公共的静态方法（JDK1.8 以上）
    // 私有方法（JDK1.9 以上）
}
 */

/*
【修饰符】 class 实现类  implements 接口{
 // 重写接口中抽象方法【必须】，当然如果实现类是抽象类，那么可以不重写
   // 重写接口中默认方法【可选】
}

【修饰符】 class 实现类 extends 父类 implements 接口{
    // 重写接口中抽象方法【必须】，当然如果实现类是抽象类，那么可以不重写
   // 重写接口中默认方法【可选】
}
 */
/*
• 如果接口的实现类是非抽象类，那么必须重写接口中所有抽象方法。
• 默认方法可以选择保留，也可以重写。
• 重写时，default 单词就不要再写了，它只用于在接口中表示默认方法，到类中就没有默认方法的概念了
• 接口中的静态方法不能被继承也不能被重写
 */
public class InterfaceTest {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Computer computer = new Computer();
        Flash flash = new Flash();
        computer.show(flash);
        C c = new C();
        c.showA();
        c.showB();

        SubClass subClass = new SubClass();
        subClass.method();

    }
}
interface USB3{
    // public static constant
    long MAX_SPEED = 500*1024*1024;

    // public abstract method
    void in();
    void out();

    //default method
    default void start(){
        System.out.println("Start");
    }
    default void stop(){
        System.out.println("Stop");
    }

    //static method
    static void show(){
        System.out.println("USB3 can read and write at MAX speed.");
    }
}

interface USB{
    public void start();
    public void stop();
}

class Computer{
    public static void show(USB usb){
        usb.start();
        System.out.println("-------------USB Device Working---------------");
        usb.stop();
    }
}
class Flash implements USB{
    public void start(){
        System.out.println("Flash USB start.");
    }

    public void stop(){
        System.out.println("Flash USB stop.");

    }
}
/*
1.【修饰符】 class 实现类  implements 接口 1，接口 2，接口 3。。。{
 // 重写接口中所有抽象方法【必须】，当然如果实现类是抽象类，那么可以不重
写
   // 重写接口中默认方法【可选】
}

2.【修饰符】 class 实现类 extends 父类 implements 接口 1，接口 2，接口
3。。。{
    // 重写接口中所有抽象方法【必须】，当然如果实现类是抽象类，那么可以不重
写
   // 重写接口中默认方法【可选】
}
 */
/*
7.5.1 默认方法冲突问题
（1）类优先原则
当一个类，既继承一个父类，又实现若干个接口时，父类中的成员方法与接口
中的抽象方法重名，子类就近选择执行父类的成员方法
（2）接口冲突（左右为难）
当一个类同时实现了多个父接口，而多个父接口中包含方法签名相同的默认方法时: 重写或者选择一个继承
通过“接口名.super.方法名"的方法选择保留哪个接口的默认方法。
子接口重写默认方法时，default 关键字可以保留。
子类重写默认方法时，default 关键字不可以保留。。
7.5.2 常量冲突问题
• 当子类继承父类又实现父接口，而父类中存在与父接口常量同名的成员变量，并且该
成员变量名在子类中仍然可见。
• 当子类同时实现多个接口，而多个接口存在相同同名常量。
 */
interface A{
    void showA();
}
interface B{
    void showB();
}

class C implements A,B{
    @Override
    public void showA(){
        System.out.println("showA");
    }

    @Override
    public void showB(){
        System.out.println("showB");
    }
}

interface Chargeable{
    void charge();
    void in();
    void out();
}

interface USBC  extends Chargeable, USB3{
    void reverse();
}

class TypeCConverter implements USBC{
    @Override
    public void reverse(){
        System.out.println("正反面都支持");
    }
    @Override
    public void charge() {
        System.out.println("可充电");
    }
    @Override
    public void in() {
        System.out.println("接收数据");
    }
    @Override
    public void out() {
        System.out.println("输出数据");
    }
}
class Mouse implements USB3{
    @Override
    public void out() {
        System.out.println("发送脉冲信号");
    }

    @Override
    public void in() {
        System.out.println("不接收信号");
    }
}

class SuperClass{
    int x = 1;
}
interface SuperInterface{
    int x = 2;
    int y = 2;
}
interface MotherInterface{
    int x = 3;
}
class SubClass extends SuperClass implements SuperInterface, MotherInterface{
    public void method(){
        //System.out.println("x = " + this.x);//模糊不清
        System.out.println("super.x = " + super.x);
        System.out.println("SuperInterface.x = " + SuperInterface.x);
        System.out.println("MotherInterface.x = " + MotherInterface.x);
        System.out.println("y = " + y);//没有重名问题，可以直接访问
    }
}
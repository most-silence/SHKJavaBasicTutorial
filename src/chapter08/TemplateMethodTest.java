package chapter08;

/*
• 数据库访问的封装
• Junit 单元测试
• JavaWeb 的 Servlet 中关于 doGet/doPost 方法调用
• Hibernate 中模板程序
• Spring 中 JDBCTemlate、HibernateTemplate 等
 */
public class TemplateMethodTest {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        BankTemplateMethod btm = new DrawMoney();
        btm.process();
        System.out.println("------------------------");
        BankTemplateMethod btm2 = new ManageMoney();
        btm2.process();
    }
}

abstract class BankTemplateMethod{
    public void takeNumber(){
        System.out.println("Queuing for number"); //
    }

    public abstract void transact();// hooks??? Specific business

    public void evaluate(){
        System.out.println("Feedback and score");
    }

    //Template method, subclass can't rewrite
    public final void process(){
        this.takeNumber();

        this.transact(); // During program runtime, a specific subclass's function that has been overridden will be called.

        this.evaluate();
    }
}

class DrawMoney extends BankTemplateMethod{
    public void transact(){
        System.out.println("I need to withdrawal.");
    }
}

class ManageMoney extends BankTemplateMethod{
    public void transact(){
        System.out.println("I need to deposit.");
    }
}
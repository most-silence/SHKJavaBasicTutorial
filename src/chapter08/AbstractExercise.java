package chapter08;

public class AbstractExercise {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
    Manager manager = new Manager();
    manager.work();

    CommonEmployee commonEmploye = new CommonEmployee();
    commonEmploye.work();

    Employee employee = new Manager();
    employee.work();
    }
}
abstract class Employee{
    protected String name;
    protected int id;
    protected double salary;
    public abstract void work();
}

class Manager extends Employee{
    public double bonus;
    public void work(){
        System.out.println("I am a manager.");
    }
}

class CommonEmployee extends Employee{
    public void work(){
        System.out.println("I am a common employee.");
    }
}

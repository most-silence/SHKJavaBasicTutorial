package chapter07;

public class Creature {
    public Creature(){
        System.out.println("Creature 无参构造");
    }
}

class Animal extends Creature{
    public Animal(String name){
        System.out.println("Animal 有参构造，该动物的名字为" + name);
    }

    public Animal(String name, int age){
        this(name);
        System.out.println("Animal 有参构造，该动物的年龄为" + age);
    }
}
class Dog extends Animal {
    public Dog(){
        super("汪汪队阿奇", 3);
        System.out.println("Dog 无参构造");
    }
    public static void main(String[] args){
        //new Dog();
        new Animal("沙币");
    }
}

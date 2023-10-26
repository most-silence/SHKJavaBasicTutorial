package chapter07;

public class CloneTest {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
    Animal a1 = new Animal("花花");

    try{
        Animal a2 = (Animal) a1.clone();
        System.out.println("Original object: " + a1);
        a2.setName("maomao");
        System.out.println("After clone:" + a2);
    } catch (CloneNotSupportedException e) {
        e.printStackTrace();
    }
    }
}

class Animal implements Cloneable{
    private String name;

    public Animal(){
        super();
    }
    public Animal(String name){
        super();
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
    @Override
    public String toString(){
        return "Animal [name=" + name + "]";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

}
package chapter08;

public class StaticTest {
    public static void main(String[] args) {
        Chinese c1 = new Chinese("kangshifu", 36);
        c1.nation = "China";
        Chinese c2 = new Chinese("laoganma", 66);
        System.out.println(c2);


    }
}
class Chinese{
    String name;
    int age;

    static String nation;

    public Chinese(){
    }
    public Chinese(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString(){
        return "Chinese{" + "name='" + name + "\'"
                + ", age=" + age
                + ", nation='" + nation + '\''+'}';
    }
}

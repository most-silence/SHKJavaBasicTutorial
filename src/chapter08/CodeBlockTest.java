package chapter08;

public class CodeBlockTest {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Chinese1 c1 = new Chinese1("张三");
        Chinese1 c2 = new Chinese1("李四");
    }
}

class Chinese1{
    private static String country;
    private String name;
    {
        System.out.println("No static Code Block, country = " + country);
    }

    static {
        country = "China";
        System.out.println("Static Code Block");
    }

    public Chinese1(String name){
        this.name = name;
    }

}

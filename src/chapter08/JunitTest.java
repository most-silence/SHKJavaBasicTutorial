package chapter08;
import org.junit.Test;

import java.util.Scanner;

public class JunitTest {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }
    @Test
    public void test01(){

        System.out.println("TestJUnit.test01");
        Scanner scanner = new Scanner(System.in);
        System.out.println(scanner.next());
    }
    @Test
    public void test02(){
        System.out.println("TestJUnit.test02");
    }
    @Test
    public void test03(){
        System.out.println("TestJUnit.test03");
    }
}

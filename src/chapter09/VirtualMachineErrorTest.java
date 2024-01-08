package chapter09;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;
/*
因为异常会引发程序跳转，从而会导致有些语句执行不到。而程序中有一些特定的代
码无论异常是否发生，都需要执行。例如，数据库连接、输入流输出流、Socket 连
接、Lock 锁的关闭等，这样的代码通常就会放到 finally 块中。所以，我们通常将一定
要被执行的代码声明在 finally 中。
– 唯一的例外，使用 System.exit(0) 来终止当前正在运行的 Java 虚拟机。
• 不论在 try 代码块中是否发生了异常事件，catch 语句是否执行，catch 语句是否有异
常，catch 语句中是否有 return，finally 块中的语句都会被执行。
• finally 语句和 catch 语句是可选的，但 finally 不能单独使用。
 */
public class VirtualMachineErrorTest {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

    //StackOverflowError
    @Test
    public void test00(){
        recursion1();
    }
    public void recursion1(){
        recursion1();
    }

    //OutOfMemoryError
    @Test
    public void test000(){
        int[] arr = new int[Integer.MAX_VALUE];
    }
    @Test
    public void test01(){
        //NullPointerException
        try{
            int[][] arr = new int[3][];
            System.out.println(arr[0].length);
        }catch(NullPointerException e){
            System.out.println("不好意思，亲~出现了小问题，正在加紧解决...");
        }
    }

    @Test
    public void test02(){
        //ClassCastException
        Object obj = 15;
        String str = (String) obj;
    }

    @Test
    public void test03(){
        //ArrayIndexOutOfBoundsException
        int[] arr = new int[5];
        for (int i = 1; i <= 5; i++) {
            System.out.println(arr[i]);
        }
    }

    @Test
    public void test04(){
        //InputMismatchException
        Scanner input = new Scanner(System.in);
        System.out.print("请输入一个整数：");//输入非整数
        int num = input.nextInt();
        input.close();
    }

    @Test
    public void test05(){
        int a = 1;
        int b = 0;
        //ArithmeticException
        System.out.println(a/b);
    }
/****************************************/
@Test
public void test06() throws InterruptedException {
    Thread.sleep(1000);//休眠 1 秒  InterruptedException
}
    @Test
    public void test07() throws ClassNotFoundException {
        Class<?> c = Class.forName("java.lang.String");//ClassNotFoundException
    }
    @Test
    public void test08() throws SQLException {
        Connection conn = DriverManager.getConnection("....");  //SQLException
    }
    @Test
    public void test09() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("尚硅谷 Java 秘籍.txt "); //FileNotFoundException
    }
    @Test
    public void test10() throws IOException {
        File file = new File("尚硅谷 Java 秘籍.txt");
        FileInputStream fis = new FileInputStream(file);//FileNotFoundException
        int b = fis.read();//IOException
        while(b != -1){
            System.out.print((char)b);
            b = fis.read();//IOException
        }

        fis.close();//IOException
    }
/****************************************/
    @Test
    public void testFinally(){
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("请输入第一个整数：");
            int a = input.nextInt();
            System.out.print("请输入第二个整数：");
            int b = input.nextInt();
            int result = a/b;
            System.out.println(a + "/" + b +"=" + result);
        } catch (InputMismatchException e) {
            System.out.println("数字格式不正确，请输入两个整数");
        }catch (ArithmeticException e){
            System.out.println("第二个整数不能为 0");
            return;
        } finally {
            System.out.println("finally");
            System.out.println("程序结束，释放资源");
            input.close();
        }

    }


}

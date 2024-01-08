package chapter09;

import org.junit.Test;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
声明抛出异常类型（throws）
• 如果在编写方法体的代码时，某句代码可能发生某个编译时异常，不处理编译不通
过，但是在当前方法体中可能不适合处理或无法给出合理的处理方式，则此方法应
显示地声明抛出异常，表明该方法将不对这些异常进行处理，而由该方法的调用者负
责处理。

修饰符 返回值类型 方法名(参数) throws 异常类名 1,异常类名 2…{   }
在 throws 后面可以写多个异常类型，用逗号隔开。
举例：
public void readFile(String file)  throws FileNotFoundException,IOExc
eption {
 ...
 // 读文件的操作可能产生 FileNotFoundException 或 IOException 类型的异
常
 FileInputStream fis = new FileInputStream(file);
    //...
}


• 如果程序代码中，涉及到资源的调用（流、数据库连接、网络连接等），则必须考虑
使用 try-catch-finally 来处理，保证不出现内存泄漏。
• 如果父类被重写的方法没有 throws 异常类型，则子类重写的方法中如果出现异常，
只能考虑使用 try-catch-finally 进行处理，不能 throws。
• 开发中，方法 a 中依次调用了方法 b,c,d 等方法，方法 b,c,d 之间是递进关系。此时，
如果方法 b,c,d 中有异常，我们通常选择使用 throws，而方法 a 中通常选择使用 try-
catch-finally。
 */
public class ExceptionThrowsTest {
    public static void main(String[] args) {
        System.out.println("Clash begin!!!");
        try{
            afterClass();
        }catch (InterruptedException e){
            e.printStackTrace();
            System.out.println("Class 提前");
        }

        System.out.println("In Class");

    }
    public static void afterClass() throws InterruptedException{
        for(int i=10; i>=1; i--){
            Thread.sleep(1000);//本来应该在这里处理异常
            System.out.println("距离上课还有：" + i + "分钟");
        }
    }

    @Test
    public void TestThrowsRuntimeException(){
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Please input the first element: ");
            int a = input.nextInt();
            System.out.println("Please input the second element: ");
            int b = input.nextInt();

            int result = divide(a,b);
            System.out.println(a+"/"+b+"="+result);
        }catch(ArithmeticException | InputMismatchException e){
            e.printStackTrace();
            System.out.println("exception");
        }finally {
            input.close();
        }
    }
    public static int divide(int a, int b) throws ArithmeticException{
        return a/b;
    }
}

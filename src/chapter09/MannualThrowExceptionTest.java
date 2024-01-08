package chapter09;
/*
Java 中异常对象的生成有两种方式：
• 由虚拟机自动生成：程序运行过程中，虚拟机检测到程序发生了问题，那么针对当前
代码，就会在后台自动创建一个对应异常类的实例对象并抛出。
• 由开发人员手动创建：new 异常类型([实参列表]);，如果创建好的异常对象不抛
出对程序没有任何影响，和创建一个普通对象一样，但是一旦 throw 抛出，就会对程
序运行产生影响了。
5.1 使用格式
throw new 异常类名(参数);
throw 语句抛出的异常对象，和 JVM 自动创建和抛出的异常对象一样。
• 如果是编译时异常类型的对象，同样需要使用 throws 或者 try...catch 处理，否则编译
不通过。
• 如果是运行时异常类型的对象，编译器不提示。
• 可以抛出的异常必须是 Throwable 或其子类的实例。下面的语句在编译时将会产生语
法错误：
  throw new String("want to throw");
 */
public class MannualThrowExceptionTest {
    public static void main(String[] args) {


    }
}

package chapter08;

public class SingletonTest {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }
}
class SingletonHun{
   private static SingletonHun singletonHun;
    private SingletonHun(){
        singletonHun = new SingletonHun();
    }
    public static SingletonHun getInstance(){
        return singletonHun;
    }
}

class SingletonLazy{
    private static SingletonLazy singletonLazy;
    private SingletonLazy(){

    }
    public static SingletonLazy getInstance(){
        if(singletonLazy ==null ){
            singletonLazy = new  SingletonLazy();
        }
        return singletonLazy;
    }
}
/*
饿汉式：
• 特点：立即加载，即在使用类的时候已经将对象创建完毕。
• 优点：实现起来简单；没有多线程安全问题。
• 缺点：当类被加载的时候，会初始化 static 的实例，静态变量被创建并分配内存空
间，从这以后，这个 static 的实例便一直占着这块内存，直到类被卸载时，静态变量
被摧毁，并释放所占有的内存。因此在某些特定条件下会耗费内存。
懒汉式：
• 特点：延迟加载，即在调用静态方法时实例才被创建。
• 优点：实现起来比较简单；当类被加载的时候，static 的实例未被创建并分配内存空
间，当静态方法第一次被调用时，初始化实例变量，并分配内存，因此在某些特定条
件下会节约内存。
• 缺点：在多线程环境中，这种实现方法是完全错误的，线程不安全，根本不能保证单
例的唯一性。
– 说明：在多线程章节，会将懒汉式改造成线程安全的模式。
 */

/*
• Windows 的 Task Manager (任务管理器)就是很典型的单例模式
• Windows 的 Recycle Bin (回收站)也是典型的单例应用。在整个系统运行过程中，回收
站一直维护着仅有的一个实例。
• Application 也是单例的典型应用
• 应用程序的日志应用，一般都使用单例模式实现，这一般是由于共享的日志文件一直
处于打开状态，因为只
  能有一个实例去操作，否则内容不好追加。
• 数据库连接池的设计一般也是采用单例模式，因为数据库连接是一种数据库资源。
 */
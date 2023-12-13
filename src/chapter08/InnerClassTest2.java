package chapter08;

import com.sun.org.apache.bcel.internal.classfile.InnerClass;

/*
## 非匿名局部内部类
语法格式：
[修饰符] class 外部类{
    [修饰符] 返回值类型  方法名(形参列表){
            [final/abstract] class 内部类{
     }
    }
}
• 编译后有自己的独立的字节码文件，只不过在内部类名前面冠以外部类名、$符号、
编号。
– 这里有编号是因为同一个外部类中，不同的方法中存在相同名称的局部内
部类
• 和成员内部类不同的是，它前面不能有权限修饰符等
• 局部内部类如同局部变量一样，有作用域
• 局部内部类中是否能访问外部类的非静态的成员，取决于所在的方法
 */
public class InnerClassTest2 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }
}
class OuterClass{
    public static void outMethod(){
        System.out.println("OuterClass.outMethod()");
        final String c= "Local c";
        class InnerClass{
            public void inMethod(){
                System.out.println("InnerClass.inMethod()");
                System.out.println(c);
            }
        }
       InnerClass innerClass = new InnerClass();
        innerClass.inMethod();
    }

    public void outTest(){
        class InnerClass{
            public void inMethod1(){
                System.out.println("InnerClass.inMethod1");
            }
        }
        InnerClass innerClass = new InnerClass();
        innerClass.inMethod1();
    }
    public static Runner getRunner(){
        class LocalRunner implements Runner{
            @Override
            public void run(){
                System.out.println("LocalRunner.run");
            }
        }
        return new LocalRunner();
    }

}
interface Runner{
    void run();
}


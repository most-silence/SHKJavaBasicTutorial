package chapter08;
/*
匿名内部类
因为考虑到这个子类或实现类是一次性的，那么我们“费尽心机”的给它取名
字，就显得多余。那么我们完全可以使用匿名内部类的方式来实现，避免给类
命名的问题。


new 父类([实参列表]){
    重写方法...
}
new 父接口(){
    重写方法...
}
 */
public class InnerClassTest3 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        new AA(){
            public void a(){
                System.out.println("aaaa");
            }
        }.a();

        AA obj = new AA() {
            public void a(){
                System.out.println("aaaaa");
            }

        };
        obj.a();

        test(new BB() {
            @Override
            public void method() {
                System.out.println("bbbb");
            }
        });

    }
    public static void test( BB b){
        b.method();
    }
}
interface AA{
    void a();

}
interface BB{
    void method();
}

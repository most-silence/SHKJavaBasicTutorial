package chapter02;
/*
- & && | || ^ !
- 单和双也有点区别 &&左边是false会直接返回true 不会运算符号右边 但是&会全部运算之后再返回true or false
- 推荐使用前者
* */
public class LogicOperator {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        boolean b1 = true;
        int num1 = 10;
        if(b1 & (num1++ > 0)){
            System.out.println("床前明月光");
        }else{
            System.out.println("我叫郭德纲");
        }

        System.out.println("num1 = " + num1);

        boolean b2 = false;
        int num2 = 10;
        if(b2 && (num2++ > 0)){
            System.out.println("床前明月光");
        }else{
            System.out.println("我叫郭德纲");
        }

        System.out.println("num2 = " + num2);

    }
}

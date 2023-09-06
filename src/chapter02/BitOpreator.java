package chapter02;
/*
1. << >> >>> & | ^ ~
2. 针对数值类型或者常量 移到最高位才会进行符号转换
3. 有符号左1右0 无符号>>> 两边都补0
* */

public class BitOpreator {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int num1 = 7; // 111
        // num1 << 2 111左移两位 11100 = 16 + 8 + 4 = 28
        System.out.println(num1 << 2);

        //交换两个变量 使用+-或者异或运算符
        int m = 10;
        int n = 20;
        m = m + n;
        n = m - n;

        System.out.println("m= " + m + ", n = " + n );//不适用非数值，可能超出值得范围


    }
}

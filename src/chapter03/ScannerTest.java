package chapter03;

import java.util.Scanner;
/*
1. 创建Scanner实例
2. 使用Scanner中的方法
3. 关闭资源
 */
public class ScannerTest {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        // nestInt nextDouble 没有nextchar 得用字符串的字符获取方法
        System.out.println("name: = " + name);
        scanner.close();
        // == 与equals的区别 前者是内存指向同一个 后者指的是内容是否一样

    }
}

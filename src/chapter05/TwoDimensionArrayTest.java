package chapter05;

public class TwoDimensionArrayTest {
    public static void main(String[] args) {
        //static Init
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9,10}};

        int[][] arr1 = new int[][]{{1,2,3},{4,5,6},{7,8,9,10}};
        // int[][] arr = new int[3][3]{{}} 错误表示，确定数组{{}}之后,[]内不能有数字，因为仅仅表示类型

        // dynamic init
        int[][] arr2 = new int[3][2];
        //不给内容时，[]内可以有数字来定义大小

        //或者通过班动态初始化，只初始化行，内部的数组可以进一步赋值与初始化
        int[][] arr3 = new int[3][];
        arr3[0] = new int[4];
        //int[][]arr = new int[][3]; 非法


        // 内存解析
        /*
        二维数组本质上是一个一维数组，不过数组内部存储的是另一些数组的首地址
         */

    }

}

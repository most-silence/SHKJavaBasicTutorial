package chapter05;

import java.util.Scanner;

/*
回形数

从键盘输入一个整数（1~20） ，则以该数字为矩阵的大小，把1,2,3…n*n 的数字按照顺时针螺旋的形式填入其中。

例如： 输入数字2，则程序输出：
1 2
4 3

输入数字3，则程序输出：
1 2 3
8 9 4
7 6 5
输入数字4， 则程序输出：
1    2    3    4
12  13  14  5
11  16  15  6
10   9   8    7
 */
public class CyclomorphicNumberArrayTest {
    public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个数字（1 - 20）：");
        int len = scanner.nextInt();
        int[][] arr = new int[len][len];
        int s = len * len;
        /*
        It is similar to fold the one sequent n^2 array
        k = 1 right
        2 down
        3 left
        4 up
         */
        int k = 1;
        int i = 0, j = 0;
        for(int m = 1; m <= s; m++){
            if(k == 1){
                if(j < len && arr[i][j] == 0){
                    arr[i][j++] = m;
                }else {
                    k = 2;
                    i++; //往下走一行 到5
                    j--; // 因为j 进入else 必须等于len 4，退出时j为边界3
                    m--; // 因为for循环体最后还会进行m++
                }
            } //此时 指向 (1,3) m = 5
            else if(k == 2){
                if(i < len && arr[i][j] == 0){
                    arr[i++][j] = m;
                }else {
                    k = 3;
                    i--;
                    j--; //?
                    m--; //?
                }
            }
            else if(k == 3){
                if(j >= 0 && arr[i][j] == 0){
                    arr[i][j--] = m;
                }else {
                    k = 4;
                    i--;
                    j++; //?
                    m--; //?
                }
            }
            else if(k == 4){
                if(i >= 0 && arr[i][j] == 0){
                    arr[i--][j] = m;
                }else {
                    k = 1;
                    i++;
                    j++; //?
                    m--; //?
                }
            }
        }
        //遍历
        for(int m = 0;m < arr.length;m++){
            for(int n = 0;n < arr[m].length;n++){
                System.out.print(arr[m][n] + "\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个数字（1 - 20） main1：");
        int len = scanner.nextInt();
        int n = len;
        int[][] arr = new int[len][len];
        int s = len * len;
        int count = 0; //要显示的数据
        int maxX = n-1; //x轴的最大下标
        int maxY = n-1; //Y轴的最大下标
        int minX = 0; //x轴的最小下标
        int minY = 0; //Y轴的最小下标
        // 通过多次遍历 所见即所得
        while(minX<=maxX) {
            for(int x=minX;x<=maxX;x++) {
                arr[minY][x] = ++count;
            }
            minY++;
            for(int y=minY;y<=maxY;y++) {
                arr[y][maxX] = ++count;
            }
            maxX--;
            for(int x=maxX;x>=minX;x--) {
                arr[maxY][x] = ++count;
            }
            maxY--;
            for(int y=maxY;y>=minY;y--) {
                arr[y][minX] = ++count;
            }
            minX++;
        }


        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr.length;j++) {
                String space = (arr[i][j]+"").length()==1 ? "0":"";
                System.out.print(space+arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}

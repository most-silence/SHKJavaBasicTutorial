package chapter05;

import com.sun.java.swing.plaf.windows.WindowsInternalFrameTitlePane;

import java.sql.SQLOutput;

public class YangHuiTest {
    public static void main(String[] args) {
        int[][] yanghui = new int[10][];

        for(int i = 0; i < 10; i++){
            int[] temp = new int[i+1];
            temp[0] = 1;
            temp[i] = 1;
            yanghui[i] = temp;
        }
        for(int i = 2; i < 10; i++){
            for(int j = 1; j < i; j++){
                yanghui[i][j] = yanghui[i-1][j] + yanghui[i-1][j-1];
            }
        }
        for(int i = 0; i < 10; i++){
            for(int j = 0; j <= i; j++){
                System.out.print(yanghui[i][j] + " ");
            }
            System.out.println();
        }
    }
}

package chapter05;

import java.util.Arrays;

public class ArrayOperateTest {
    public static void main(String[] args) {

        int[] arr1 = new int[]{1,2,3,4,5};
        int[] arr2 = new int[]{1,2,3,5,4};
        System.out.println(arr1 == arr2);

        boolean isEquals = Arrays.equals(arr1, arr2);
        System.out.println(isEquals);

        System.out.println(Arrays.toString(arr1));
        // 快速排序
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));

        // 二分查找，前提有序
        int index =  Arrays.binarySearch(arr1, 5);
        // 找到才是正数
        System.out.println(index);

    }
}

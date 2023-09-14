package OrderChapter;

public class BubbleSort {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }
}

class BubbleSort1{
    public static void main(String[] args) {
        int[] arr = {6, 9, 2, 9, 1};
        // 从小到大排序 因为冒泡的特性，先排好的是最大的（从后往前有序）
        for(int i = 1; i < arr.length; i++){
            //arr[i] 与i之前所有元素依次进行比较，小于则往前放
            // i从1开始是考虑到j+1的边界问题
            for(int j = 0; j < arr.length - i; j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

    }
}
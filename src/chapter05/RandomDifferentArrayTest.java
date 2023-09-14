package chapter05;

public class RandomDifferentArrayTest {

    public void test1(){
        int[] arr = new int[6];
        int [] bucketArr = new int[31];

        int sum = 0;
        boolean flag = true;
        while(flag){
            int temp = (int)(Math.random() * 30) + 1;
            if(bucketArr[temp] == 1){
                continue;
            }else{
                sum++;
                bucketArr[temp] = 1;
                arr[sum - 1] = temp;
            }
            if(sum==6){
                flag = false;
            }
        }

        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[6];
        int [] bucketArr = new int[31];

        int sum = 0;
        boolean flag = true;
        while(flag){
            int temp = (int)(Math.random() * 30) + 1;
            if(bucketArr[temp] == 1){
                continue;
            }else{
                sum++;
                bucketArr[temp] = 1;
                arr[sum - 1] = temp;
            }
            if(sum==6){
                flag = false;
            }
        }

        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}

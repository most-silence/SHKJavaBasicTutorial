package SearchChapter;

public class BinarySearch {
    public static void main(String[] args) {
        // The premise it that this array must be ordered
        int[] arr3 = new int[]{-99,-54,-2,0,2,33,43,256,999};
        boolean isFlag = true;
        int value = 256;
        int head = 0;
        int tail = arr3.length  - 1;

        // When head and tail simultaneously pointing to the same element, the search is successful
        while(head < tail){
            int mid = (tail + head)/2;
            if(value == arr3[mid]){
                System.out.println("找到指定的元素，索引为：" + mid);
                isFlag = false;
                break;
            }else if(value < arr3[mid]){
                tail = mid - 1 ;
            }
            else if(value > arr3[mid]){
                head = mid + 1 ;
            }
        }
        if(isFlag){
            System.out.println("未找打指定的元素");
        }

    }
}

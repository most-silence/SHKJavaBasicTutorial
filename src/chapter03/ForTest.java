package chapter03;

public class ForTest {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        for (int i = 100; i <=999; i++){
            int bai = (i / 100);
            int shi = (i % 100) / 10;
            int ge =  (i % 100) % 10;
            if(i == (ge * ge * ge + shi * shi * shi + bai * bai * bai)){
                System.out.println(i);
            }

        }
    }
}

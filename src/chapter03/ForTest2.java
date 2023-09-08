package chapter03;

public class ForTest2 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int m = 12;
        int n = 20;
        int min = m > n ? n : m;
        int max = m > n ? m : n;
        // 最大公约数
        for( int i = min; i > 1; i-- ){
            if(m % i == 0 && n % i == 0){
                System.out.println("最大公约数为：" + i);
                break;
            }
            System.out.println("最大公约数为：1");
        }
        for(int j = max; j <= max * min; j++){
           if(j % m == 0 && j % n == 0){

               System.out.println("最小公倍数为：" + j);
               break;
           }

            System.out.println("最小公倍数为：" + m * n );
        }
    }
}

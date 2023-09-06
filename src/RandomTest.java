public class RandomTest {
    public static void main(String[] args) {
        double d1 = Math.random(); // Between [0,1）
        System.out.println("d1 = " + d1);

        int num = (int)(Math.random()*101); // Between [0,100]
        System.out.println("num = " + num);

        int a, b;
        a = 100;
        b = 1;
        int num_template = (int)(Math.random()*(a - b + 1))+b; // Between [b,a]
    }
}

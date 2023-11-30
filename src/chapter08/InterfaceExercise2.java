package chapter08;

public class InterfaceExercise2 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
    ComparableCircle c1 =  new ComparableCircle(1.0);
        ComparableCircle c2 =  new ComparableCircle(1.0);
        System.out.println(c2.compareTo(c2));

    }
}

interface CompareObject{
    //若返回值是 0 , 代表相等; 若为正数，代表当前对象大；负数代表当前对象小
    public int compareTo(Object o);
}

class Circle {
    private double redius;

    public void setRedius(double redius){
        this.redius = redius;
    }
    public double getRedius(){
        return this.redius;
    }
}

class ComparableCircle extends Circle implements CompareObject{
    public ComparableCircle(double redius){
        super.setRedius(redius);
    }
    @Override
    public int compareTo(Object o){
        if(super.getRedius() > ((Circle)o).getRedius()) return 1;
        else if(super.getRedius() < ((Circle)o).getRedius()) return -1;
        else return 0;
    }
}
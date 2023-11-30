package chapter08;

import com.sun.xml.internal.stream.util.BufferAllocator;

public class InterfaceExercise {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Rollable rb = new Ball("Football");
        rb.play();
    }
}
interface Playable{
    void play();
}

interface Bounceable{
    void play();
}

interface Rollable extends Playable, Bounceable{
    Ball ball = new Ball("PingPang"); //defaule static final variable
    //@Override
    //default void play() {
    //    //ball = new Ball("Football");
    //    System.out.println(ball.getName());
    //}
}


class Ball implements Rollable{
    private String name;

    public String getName(){
        return name;
    }
    public Ball(String name){
        this.name = name;
    }
    public void play(){
        //ball = new Ball("Football");
        System.out.println(ball.getName());
    }

}
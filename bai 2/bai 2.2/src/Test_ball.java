import java.lang.*;
import java.util.Scanner;

public class Test_ball{
    public static void main(String[] args) {
        Ball ball= new Ball(0,0,4,6);
        System.out.println("Begin:"+ ball);
        ball.move();
        System.out.println("After move: "+ball);
        ball.reverse();
        ball.move();
        System.out.println("After reverse move: "+ ball);
    }
}
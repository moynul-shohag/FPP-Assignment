package assignment_2;
import java.lang.Math;
public class Prog1 {
    public static void main(String[]args)
    {
        RandomNumbers rn = new RandomNumbers();
        int x = rn.getRandomInt(1,9);
        int y = rn.getRandomInt(3,14);
        double piX = Math.PI*x;
        double piY=Math.PI*y;
        System.out.println("Random number x in the range (1 .. 9) is: "+ x + ", πx: "+piX);
        System.out.println("Random number y in the range (3 .. 14) is: "+ y + ",Yπ: "+piY);
    }
}

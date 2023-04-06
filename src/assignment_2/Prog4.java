package assignment_2;
import java.lang.Math;
public class Prog4 {
    public static void main(String[]args)
    {
        float f1=1.27F;
        float f2=3.881F;
        float f3=9.6F;
        int sum=(int)(f1+f2+f3);
        int sum2=Math.round(f1+f2+f3);

        System.out.println("the sum of the floats as an integer, obtained by casting the sum to type int: " + sum);

        System.out.println("the sum of the floats as an integer, obtained by rounding the sum to the nearest integer, using the\n" +
                "Math.round function: " + sum2);
    }

}

package prog_3;
import java.util.*;
public class RandomNumbers {
    static Random random;

    private RandomNumbers() {
        random = new Random();
    }


    /**
     *  Use this method to get a random integer, with a call like this:
     *     int myInt = RandomNumbers.getRandomInt();
     */
    public static int getRandomInt() {
        if(random == null) new RandomNumbers();
        return random.nextInt();
    }
    /**
     * Returns a random integer x satisfying
     * lower <= x <= upper. If lower > upper, returns 0.
     * @param lower
     * @param upper
     * @return
     */
    public static int getRandomInt(int lower, int upper) {
        if(lower > upper) return 0;
        if(lower == upper) return lower;
        int difference = upper - lower;
        int start = getRandomInt();

        //nonneg int in the range 0..difference - 1
        start = Math.abs(start) % (difference+1);

        start += lower;
        return start;
    }

    public static void main(String[] args){
        System.out.println("----------------------------------------------");
        System.out.println("Byte: "+ Byte.MAX_VALUE+" "+Byte.MIN_VALUE );
        System.out.println("Short: "+Short.MAX_VALUE+" "+Short.MIN_VALUE );
        System.out.println("Integer: "+Integer.MAX_VALUE+" "+Integer.MIN_VALUE );
        System.out.println("Long: "+Long.MAX_VALUE+" "+Long.MIN_VALUE );
        System.out.println("----------------------------------------------");
        //2000000000
        RandomNumbers rn = new RandomNumbers();
        long randomNumber=rn.getRandomInt(0, 2000000000);
        System.out.println("Generated Random Number: "+randomNumber);

        if (randomNumber <= Byte.MAX_VALUE && randomNumber >= Byte.MIN_VALUE) {
            System.out.println("byte");
        } else if (randomNumber <= Short.MAX_VALUE && randomNumber >= Short.MIN_VALUE) {
            System.out.println("short");
        } else if (randomNumber <= Integer.MAX_VALUE && randomNumber >= Integer.MIN_VALUE) {
            System.out.println("int");
        } else {
            System.out.println("long");
        }

    }
}

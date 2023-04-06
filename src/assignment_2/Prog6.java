package assignment_2;

import java.util.Arrays;

public class Prog6 {
    public static void main (String[]args)
    {
        int[] arr={2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, -22};
        int minNumber=min(arr);
        System.out.println(minNumber);
    }

    public static int min(int[] arrayOfInts)
    {
        int minNum=arrayOfInts[0];
        for(int i=1;i< arrayOfInts.length;i++)
        {
            if(minNum>arrayOfInts[i])
            {
                minNum=arrayOfInts[i];
            }
        }
        return minNum;
    }

}

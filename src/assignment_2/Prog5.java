package assignment_2;

import java.util.Arrays;

public class Prog5 {
    public static void main(String []args)
    {
        int [] a = {5,6,-4,3,1};
        int [] b= {3,8,9,11};
        int [] newArray=new int[a.length+b.length];
        //Output arrays: [ 5,6,-4,3,1,3,8,9,11]
        System.arraycopy(a,0,newArray,0,5);
        System.arraycopy(b,0,newArray,5,4);
        System.out.println(Arrays.toString(newArray));

    }
}

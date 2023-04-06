package assignment_2;

import java.util.Arrays;

public class Prog3 {
    public static void main (String[]args)
    {
        String[] inpuArr={"horse", "dog", "cat", "horse", "dog"};
        String [] uniqueArr=RemoveDups(inpuArr);
        System.out.println(Arrays.toString(uniqueArr));
    }

    public static String[] RemoveDups(String [] arr)
    {
        int len = arr.length;

        for(int i=0;i<len;i++)
        {
            for(int j=i+1;j<len;j++)
            {
                if(arr[i].equals(arr[j]))
                {
                    arr[j]=arr[j-1];
                    len--;
                    j--;
                }
            }
        }
        String [] newArr=new String[len];
        System.arraycopy(arr, 0, newArr, 0, len);
        return newArr;
    }

}

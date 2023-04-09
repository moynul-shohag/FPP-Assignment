package assignment_4;

public class ProbThreeSumArrayElement {

    public static void main(String[]args){
        int[]arr={4,5,1};
        System.out.println("Sum of array elements is: "+recSumArrayElement(arr));
    }

    public static int recSumArrayElement(int[]arr){

        return recSumArrayElementHelper(arr,0,0);
    }

    public static int recSumArrayElementHelper(int[]arr,int sum,int count){
        if(count==arr.length) return sum;
        sum=sum+arr[count];
        count++;
        return recSumArrayElementHelper(arr,sum,count);

    }

/* Without recursive
    public static int sumArrayElement(int[]arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }*/
}

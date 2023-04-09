package assignment_4;

public class ProbTwoDigitCount {

    public static void main(String[]args){
        int n=12345;
        //System.out.println("Digit Count of the given number "+n+ " is: "+ digitCount(n));
        System.out.println("Digit Count of the given number: "+ recDigitCount(n));
    }

    public static int recDigitCount(int n){
        return recDigitCountHelper(n,0);
    }
    public static int recDigitCountHelper(int n,int count){
        if(n==0) return count;
        int modValue=n%10;
        count++;
       return recDigitCountHelper(n/10,count) ;
    }

  /* without recursive
    public static int digitCount(int n){
        int count=0;
        while(n>0){
            int modValue=n%10;
            count++;
            n=n/10;
        }
        return count;
    }*/

}

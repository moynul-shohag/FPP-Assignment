package assignment_4;

public class ProbOneReverseInteger {

    public static void main(String[]args){
        int n=12345;
        System.out.println("Reverse number of "+n+" is: "+revIntRec(n));
    }



    public static int revIntRec(int n) {
        return revIntRecHelper(n, 0);
    }

    private static int revIntRecHelper(int n, int reversed) {
        if (n == 0) {
            return reversed;
        }
        int modValue = n % 10;
        int newReversed = reversed * 10 + modValue;
        int numWithoutLastDigit = n / 10;
        return revIntRecHelper(numWithoutLastDigit, newReversed);
    }

/* Another way of recursive
    public static void recReverseInteger(int n)
    {
        if(n<10)
        {
            System.out.println(n);
        }else{
            System.out.print(n % 10);
            recReverseInteger(n/10);
        }
    }*/

    /* Without recursive
    public static int reverseInteger(int n)
    {
        int reverseNum=0;
        while(n>0) {
            int modValue=n%10;
            reverseNum= reverseNum*10+modValue;
            n=n/10;
        }
        return reverseNum;

    }*/
}



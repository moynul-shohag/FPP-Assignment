package assignment_1;

public class Prog1_2 {
    public static void main(String[] args) {
        String expr="Hi \uD83D\uDC4B, my name is \u09AE\u0988\u09A8\u09C1\u09B2";
        System.out.println(expr);
        System.out.println(expr.length());

        //The length of "Expr" string is 23. though there is too many character but each code unit("\u09AE") count as single character.
    }
}
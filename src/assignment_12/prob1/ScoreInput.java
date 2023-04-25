package assignment_12.prob1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScoreInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score;

        while (true) {
            try {
                System.out.print("Enter score (0-100): ");
                score = scanner.nextInt();
                if (score < 0 || score > 100) {
                    throw new UnsupportedOperationException("Score must be between 0 and 100");
                }
                break;
            } catch (InputMismatchException ime) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
            } catch (UnsupportedOperationException uoe) {
                System.out.println(uoe.getMessage());
            } catch (Exception e) {
                System.out.println("An error occurred: " + e.getMessage());
            }
        }

        System.out.println("Score entered: " + score);
    }
}
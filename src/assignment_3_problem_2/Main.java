package assignment_3_problem_2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter First Name: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter Last Name: ");
        String lastName = scanner.nextLine();
        System.out.print("Please enter your birthdate in the format-(yyyy-MM-dd) -Example (1989-4-14): ");
        LocalDate dateOfBirth = LocalDate.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("yyyy-MM-dd"));

        HeartRates person = new HeartRates(firstName, lastName, dateOfBirth);
        person.calculateTargetHeartRateRange();

    }

}

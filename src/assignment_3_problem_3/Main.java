package assignment_3_problem_3;
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
    System.out.println("Enter C for circle\nEnter R for Rectangle\nEnter T for Triangle");
        Scanner sc=new Scanner(System.in);
        char c = sc.next().toUpperCase().charAt(0);
        if(c=='C')
        {
            System.out.println("Enter the Base of the Triangle");
            double base=sc.nextDouble();
            System.out.println("Enter the height of the Triangle");
            double height=sc.nextDouble();
            Triangle tc =new Triangle(base,height);
            System.out.println("The area of Triangle is: "+tc.computeArea());
        }else if(c=='R'){
            System.out.println("Enter the width of the Rectangle");
            double width=sc.nextDouble();
            System.out.println("Enter the length of the Rectangle");
            double length=sc.nextDouble();
            Rectangle tc =new Rectangle(width,length);
            System.out.println("The area of Triangle is: "+tc.computeArea());
        }else if(c=='T'){
            System.out.println("Enter the radius of the Circle");
            double radius=sc.nextDouble();
            Circle tc =new Circle(radius);
            System.out.println("The area of Triangle is: "+tc.computeArea());
        }else{
            System.out.println("You select different letter");
        }

    }
}

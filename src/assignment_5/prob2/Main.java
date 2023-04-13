package assignment_5.prob2;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[]args){
        Professor prof1=new Professor("Moynul Islam",LocalDate.of(2008, 12, 01),280000,20);
        Professor prof2=new Professor("Rana Islam",LocalDate.of(2009, 01, 01),300000,30);
        Professor prof3=new Professor("Tanvir Khan",LocalDate.of(2010, 02, 01),350000,50);
        Secretary sec1=new Secretary("Reza Khan",LocalDate.of(2012, 02, 01),450000,10);
        //sec1.setOvertimeHours(10);
        Secretary sec2=new Secretary("Diya Khan",LocalDate.of(2013, 02, 01),400000,20);
        //sec2.setOvertimeHours(20);
        DeptEmployee [] departments=new DeptEmployee[5];
        departments[0]=prof1;
        departments[1]=prof2;
        departments[2]=prof3;
        departments[3]=sec1;
        departments[4]=sec2;

       /* for(DeptEmployee de:departments){
            System.out.println("Name: "+de.getName()+", Hire Date: "+de.getHireDay()+", Salary: "+de.computeSalary());
        }*/

        System.out.printf("\nDo you want to see the sum of all Professor and Secretary salary in the department, If Yes please press \"Y\": ");
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().toUpperCase().charAt(0);
        if(ch=='Y'){
            double totalSalary=0;
            for(DeptEmployee de:departments){
               totalSalary+=de.computeSalary();
            }
            System.out.println("Sum of all Professor and Secretary salary in the department is $: "+totalSalary);
        }else{
            System.out.println("Please run the program again and press \"Y\" if you want to see the sum of all Professor and Secretary salary in the department");
        }

    }


}

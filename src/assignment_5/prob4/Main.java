package assignment_5.prob4;

public class Main {
    public static void main(String[]args){
        Employee [] employees={new CommisionEmployee("Moynul","Islam","1234",10000,0.10),
                new BasePlusCommissionEmployee("Reza","Khan","1235",10000,0.10,10000),
                new HourlyEmployee("Tanvir","Khan","1236",15,10),
                new SalariedEmployee("Fahim","Uddin","1237",2000)};
        for(Employee emp:employees){
            System.out.println(emp.toString());
        }
        double totalPayment=0;
        for(Employee emp:employees){
            totalPayment+=emp.getPayment();

        }
        System.out.println(totalPayment);

    }

}

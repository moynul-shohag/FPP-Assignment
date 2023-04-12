package assignment5.prob4;

public class CommisionEmployee extends Employee{

    private double grossSales;
    private double commissionRate;
public CommisionEmployee(String firstName, String lastName,String ssn,double grossSales,double commissionRate){
    super(firstName,lastName,ssn);
    this.grossSales=grossSales;
    this.commissionRate=commissionRate;
}

    @Override
    public double getPayment() {
        return grossSales * commissionRate;
    }

    @Override
    public String toString() {
        return "CommissionEmployee[" +
                "grossSales=" + grossSales +
                ", commissionRate=" + commissionRate +
                "] " + super.toString();
    }
}

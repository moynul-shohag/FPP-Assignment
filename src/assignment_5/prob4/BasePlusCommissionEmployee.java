package assignment_5.prob4;

public class BasePlusCommissionEmployee extends CommisionEmployee{
    public double baseSalary;
    public BasePlusCommissionEmployee(String firstName, String lastName,String ssn,double grossSales,double commissionRate,double baseSalary){
        super(firstName,lastName,ssn,grossSales,commissionRate);
        this.baseSalary=baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    @Override
    public double getPayment() {
        return baseSalary+super.getPayment();
    }

    @Override
    public String toString() {
        return "BasePlusCommissionEmployee[" +
                "baseSalary=" + baseSalary +
                "] " + super.toString();
    }
}

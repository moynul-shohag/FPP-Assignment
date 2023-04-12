package assignment5.prob4;

public class HourlyEmployee extends Employee{
    private double wage;
    private double hours;

    public HourlyEmployee(String firstName, String lastName,String ssn,double wage,double hours){
        super(firstName,lastName,ssn);
        this.wage=wage;
        this.hours=hours;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    @Override
    public double getPayment() {
        return wage * hours;
    }

    @Override
    public String toString() {
        return "HourlyEmployee[" +
                "wage=" + wage +
                ", hours=" + hours +
                "] " + super.toString();
    }
}

package assignment_3_problem_1;

public class Customer {
    private String firstName;
    private String lastName;
    private String socSecurityNum;
    private Address billingAddress ;
    private Address shippingAddress;

    static final String billAddress = "Chicago";

    public Customer(String fName,String lName,String socNum)
    {
        this.firstName=fName;
        this.lastName=lName;
        this.socSecurityNum=socNum;
    }

    public void setFirstName(String fName)
    {
        this.firstName=fName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSocSecurityNum(String socSecurityNum) {
        this.socSecurityNum = socSecurityNum;
    }

    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
    }

    public void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocSecurityNum() {
        return socSecurityNum;
    }

    public Address getBillingAddress() {
        return billingAddress;
    }

    public Address getShippingAddress() {
        return shippingAddress;
    }

    public String toString() {
        return "[" + firstName + ", " + lastName + ", " + "ssn: " + socSecurityNum + "]";
    }

}

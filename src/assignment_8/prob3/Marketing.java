package assignment_8.prob3;

public class Marketing {
    private String employeeName;
    private String productName;
    private double salesAmount;


    public Marketing(String empName, String prodName, double sAmount) {
        employeeName = empName;
        productName = prodName;
        salesAmount = sAmount;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getProductName() {
        return productName;
    }

    public double getSalesAmount() {
        return salesAmount;
    }

    public String toString() {
        return "Marketing [ EmployeeName: " + employeeName + " ProductName: " + productName + " SalesAmount: " + salesAmount + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof Marketing)) return false;
        Marketing m = (Marketing) obj;
        return this.salesAmount == m.salesAmount;
    }



}
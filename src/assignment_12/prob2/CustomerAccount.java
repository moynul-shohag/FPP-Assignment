package assignment_12.prob2;
public class CustomerAccount {
    private String cus_Name;
    private int acc_No;
    private double balance;

    public CustomerAccount(String cusName, int accNo, double balance) {
        cus_Name = cusName;
        acc_No = accNo;
        this.balance = balance;
    }

    public boolean deposit(double amount) {
        if (amount < 0) {
            return false;
        }
        this.balance += amount;
        return true;
    }

    public boolean withdraw(double amount) throws InsufficientFundsException {
        if (amount < 0 || amount > this.balance) {
            throw new InsufficientFundsException("Insufficient funds");
        } else if (this.balance - amount < 100) {
            throw new InsufficientFundsException("Balance cannot be below $100");
        }
        this.balance -= amount;
        return true;
    }

    public double getBalance() {
        return this.balance;
    }
}

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}
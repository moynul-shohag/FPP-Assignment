package assignment5.prob2;

import java.time.LocalDate;

public class Secretary extends DeptEmployee{

    private int overtimeHours;
    public Secretary(String name, LocalDate hireDay, double salary, int overtimeHours){
        super(name,hireDay,salary);
        this.overtimeHours=overtimeHours;
    }

    public int getOvertimeHours() {
        return overtimeHours;
    }

    public void setOvertimeHours(int overtimeHours) {
        this.overtimeHours = overtimeHours;
    }

    @Override
    public double computeSalary() {
        return super.computeSalary()+(12*this.overtimeHours);
    }
}

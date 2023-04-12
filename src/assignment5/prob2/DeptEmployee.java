package assignment5.prob2;

import java.time.LocalDate;

public class DeptEmployee {
    private String name;
    private LocalDate hireDay;
    double salary;
    public DeptEmployee(String name,LocalDate hireDay,double salary){
        this.name=name;
        this.hireDay=hireDay;
        this.salary=salary;

    }

    public String getName() {
        return name;
    }

    public double computeSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }


}

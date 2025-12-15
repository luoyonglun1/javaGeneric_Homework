package co.istad.exercise;

import java.math.BigDecimal;

public class Teacher extends Person{
    private BigDecimal salary ;

    public Teacher(String name, String gender, Double height, BigDecimal salary) {
        super(name, gender, height);
        this.salary = salary;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }
}

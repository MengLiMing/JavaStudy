package com.study.day6;

public class Salary extends Employee {
    private double salary;//全年工资
    public Salary(String name, String address, int number, double salary) {
        super(name,address,number);
        setSalary(salary);
    }

    public void mailCheck() {
        System.out.println("Salary 类的 mailCheck 方法");
        System.out.println("邮寄支票给：" + getName() + "，工资为：" + salary);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary >= 0.0) {
            this.salary = salary;
        }
    }

    public double computePay() {
        System.out.println("计算工资，付给：" + getName());
        return salary/52;
    }
}

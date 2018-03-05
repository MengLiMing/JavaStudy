package com.study.day1;

public class Employee {
    public static final String DEPARTMENT = "开发人员";

    public String name;

    private double salary;

    public Employee(String empName) {
        name = empName;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void printEmp() {
        System.out.println("名字：" + name);
        System.out.println("薪水：" + salary);
    }

    public static void main(String[] args) {
        Employee empOne = new Employee("RUNOOB");
        empOne.setSalary(1000);
        empOne.printEmp();

        System.out.println(DEPARTMENT + "平均工资：" + empOne.salary);
    }
}

package com.study.day5;

public class SubClass extends SuperClass {
    private int n;

    SubClass() {
        super(300);
        System.out.println("SubClass");
    }

    //子类构造器如果没有用super关键字，系统自动调用父类的无参构造器
    public SubClass(int n) {
        System.out.println("SubClass(int n):" +n);
        this.n = n;
    }
}

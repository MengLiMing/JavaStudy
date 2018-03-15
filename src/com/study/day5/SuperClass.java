package com.study.day5;

public class SuperClass {
    private int n;
    SuperClass() {
        System.out.println("SuperClass()");
    }
    SuperClass(int n) {
        System.out.println("SuperClass(int n)");
        this.n = n;
    }
}

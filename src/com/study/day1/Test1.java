package com.study.day1;

public class Test1 {
    public static void main(String[] args) {
        int a = 60;
        int b = 13;
        int c = 0;

        c = a & b;
        System.out.println("a & b = " + c);

        c= a | b;
        System.out.println("a | b = " + c);

        c = a ^ b;
        System.out.println("a ^ b = " + c);

        c= ~a;
        System.out.println("~a = " + c);

        c = a << 2;
        System.out.println("a << 2 = " + c);

        c = a >> 2;
        System.out.println("a >> 2 = " + c);

        c = a >>> 2;
        System.out.println("a >>> 2 = " + c);

        String name = "James";
        boolean result = name instanceof String;
    }
}

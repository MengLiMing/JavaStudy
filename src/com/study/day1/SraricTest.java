package com.study.day1;

public class SraricTest {
    private static int staticInt = 2;
    private int random = 2;

    public SraricTest() {
        staticInt++;
        random++;
        System.out.println("staticInt = "+staticInt+"  random = " + random);
    }

    public static void main(String[] args) {
        SraricTest test = new SraricTest();
        SraricTest test2 = new SraricTest();
    }
}

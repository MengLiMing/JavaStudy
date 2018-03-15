package com.study.day3;

public class Test1 {
    public static void main(String[] args) {
        float t= 9.f;
        int q = 5;
        System.out.println((t++)*(--q));
        System.out.println(t);


        String a = new String("1");
        String b = new String("1");
        System.out.println(a==b);


        String c = "1";
        String d = "1";
        System.out.println(c==d);

    }
}

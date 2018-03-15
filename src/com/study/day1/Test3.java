package com.study.day1;

public class Test3 {
    public static void main(String[] args) {
        Integer x = 5;
        x += 10;
        System.out.println(x);


        System.out.println("90度的正弦值：" + Math.sin(Math.PI/2));
        System.out.println("0度的余弦值：" + Math.cos(0));
        System.out.println("60度的正切值：" + Math.tan(Math.PI/3));
        System.out.println("1的反正切值：" + Math.atan(1));
        System.out.println("π/2的角度值：" + Math.toDegrees(Math.PI/2));
        System.out.println(Math.PI);

        System.out.println("******************");

        //比较大小 1小于  0等于  -1大于
        System.out.println(x.compareTo(15));
        //是否相等
        System.out.println(x.equals(5));


    }
}

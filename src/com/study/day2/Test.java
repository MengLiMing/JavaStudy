package com.study.day2;

public class Test {
    public static void main(String[] args) {

        //StringBuffer 线程安全，速度慢
        //StringBuilder 线程不安全，速度快

        StringBuffer sBuffer = new StringBuffer("菜鸟教程官网：");
        sBuffer.append("www");
        sBuffer.append(".runoob");
        sBuffer.append(".com");
        System.out.println(sBuffer);
    }
}

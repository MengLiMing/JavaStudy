package com.study.day1;

public class Puppy {
    int puppyAge;

    public Puppy(String name) {
        System.out.println("小狗的名字是：" + name);
    }

    public void setPuppyAge(int puppyAge) {
        this.puppyAge = puppyAge;
    }

    public int getPuppyAge() {
        System.out.println("小狗的年龄为：" + puppyAge);
        return puppyAge;
    }

    public static void main(String[] args) {
        Puppy myPuppy = new Puppy("tommy");
        myPuppy.setPuppyAge(2);
        myPuppy.getPuppyAge();
        System.out.println("变量值：" + myPuppy.puppyAge);


        final double PI = 3.1415926;
        byte a = 68;
        char a1 = 'A';
        int decimal = 100;
        int octal = 0144;
        int hexa = 0x64;
    }

}

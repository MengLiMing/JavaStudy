package com.study.day8;

public class Employee implements java.io.Serializable {
    public String name;
    public String address;
    public transient int SSN;//短暂的不需要序列化
    public int number;
    public void mailCheck() {
        System.out.println("Mailing a check to " + name + " " + address);
    }
}

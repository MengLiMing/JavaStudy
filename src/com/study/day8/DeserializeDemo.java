package com.study.day8;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeDemo {
    public static void main(String[] args) {
        Employee e = null;
        try {
            String fileStr = "/Users/mac/Desktop/Java/tmp/employee.ser";
            FileInputStream fileIn = new FileInputStream(fileStr);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            e = (Employee)in.readObject();
            fileIn.close();
        } catch (IOException i) {
            i.printStackTrace();
            return;
        } catch (ClassNotFoundException c) {
            System.out.println("Employee class not found");
            c.printStackTrace();
            return;
        }

        System.out.println("Deserialized Employee...");
        System.out.println("Name: " + e.name);
        System.out.println("Address: " + e.address);
        System.out.println("SSN: " + e.SSN);
        System.out.println("Number: " + e.number);
    }
}

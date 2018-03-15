package com.study.day7;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableDemo {

    public static void main(String[] args) {
        Hashtable balance = new Hashtable();
        Enumeration names;
        String str;
        double bal;

        balance.put("Zara", Double.valueOf(3434.34));
        balance.put("Mahnaz", Double.valueOf(123.22));
        balance.put("Ayan", Double.valueOf(1378.00));
        balance.put("Daisy", Double.valueOf(99.22));
        balance.put("Qadir", Double.valueOf(-19.08));

        names = balance.keys();
        while (names.hasMoreElements()) {
            str = (String) names.nextElement();
            System.out.println(str + ": " + balance.get(str));
        }
        System.out.println();

        bal = ((Double)balance.get("Zara")).doubleValue();
        balance.put("Zara", Double.valueOf(bal+1000));
        System.out.println("Zara's new balance: " + balance.get("Zara"));

    }
}

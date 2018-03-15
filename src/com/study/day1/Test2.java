package com.study.day1;

public class Test2 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        for (int x : numbers) {
            if (x == 30) {
                break;
            }
            System.out.print(x);
            System.out.print(",");
        }
        System.out.print("\n");
        String[] names = {"James", "Larry", "Tom", "Lacy"};

        for (String name: names) {
            if (name.equals("Tom")) {
                continue;
            }
            System.out.print(name);
            System.out.print(",");
        }
    }
}

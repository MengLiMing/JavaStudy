package com.study.day1;

public class InstanceCounter {
    private static int numInstances = 0;

    final int value = 10;
    public static final int BOXWIDTH = 6;
    static final String TITLE = "Manager";

    protected static int getCount() {
        return numInstances;
    }
    private static void addInstance() {
        numInstances++;
    }

    InstanceCounter() {
        InstanceCounter.addInstance();
    }

    public final class Test {

    }

    public static void main(String[] args) {
        System.out.println("Starting With " + InstanceCounter.getCount() + " instances");
        for (int i = 0; i < 500; i++) {
            new InstanceCounter();
        }
        System.out.println("Created " + InstanceCounter.getCount() + " instances");
    }

}


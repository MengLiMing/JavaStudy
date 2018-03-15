package com.study.day11;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {

    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(5);
        TaskRunnable task = new TaskRunnable();

        service.submit(task);
        System.out.println("----------------------");
        service.submit(task);
        service.shutdown();
    }
}

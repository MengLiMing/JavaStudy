package com.study.day11;

public class TaskRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("自定义线程任务在执行"+i);
        }
    }
}

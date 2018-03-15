package com.study.day4;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("next方式接收：");

        //从开始到下一个有效字符，不返回空格
//        if (scan.hasNext()) {
//            String str1 = scan.next();
//            System.out.println("输入的数据为：" + str1);
//        }

        //从开始到回车的所有字符
        if (scan.hasNextLine()) {
            String str1 = scan.nextLine();
            System.out.println("输入的数据为：" + str1);
        }

        scan.close();
    }
}

package com.study.day2;

public class StringDemo {
    public static void main(String[] args) {
        char[] helloArray = {'r', 'u', 'n', 'o', 'o', 'b'};
        String helloString = new String(helloArray);
        System.out.println(helloString);

        String site = "www.runoob.com";
        int len = site.length();
        System.out.println("菜鸟教程网址长度：" + len);

        String string1 = "菜鸟教程网址：";
        System.out.println("1、" + string1 + site);


        System.out.println(string1.charAt(1));

        System.out.println(site.compareToIgnoreCase("WWW.RUNOOB.COM"));
        System.out.println(site.equalsIgnoreCase("WWW.RUNOOB.COM"));

        System.out.println(site.indexOf("o",9));


        System.out.println(site);
        String[] strArr = site.split(".");
        System.out.println(strArr.length);


        String str1 = new String("www.runoob.com");
        String[] strArr1 = str1.split("\\.");
        System.out.println(strArr1.length);

        System.out.println(str1.toUpperCase());

        String str2 = str1.trim();
        String str3 = "www.runoob.com";
        System.out.println(str2 == str1);
        System.out.println(str2.equals(str1));
        System.out.println(str3 == str1);
        System.out.println(str3.equals(str1));
    }
}

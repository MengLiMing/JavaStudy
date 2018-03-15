package com.study.day8;

import java.util.ArrayList;
import java.util.List;

public class GenericTest {
    public static void main(String[] args) {
        List<String> name = new ArrayList<String>();
        List<Integer> age = new ArrayList<Integer>();
        List<Number> number = new ArrayList<Number>();

        name.add("icon");
        age.add(18);
        number.add(314);

        getData(name);
        getData(age);
        getData(number);

        System.out.println();

//        getUperNumber(name);
        getUperNumber(age);
//        getUperNumber(number);

        System.out.println();

//        getInteger(name);
        getInteger(age);
        getInteger(number);
    }

    public static void getData(List<?> data) {
        System.out.println("data : " + data.get(0));
    }

    //设置上限,泛型必须是Integer类型或者其子类
    public static void getUperNumber(List<? extends Integer> data) {
        System.out.println("data : " + data.get(0));
    }

    //试一下换一种写的方式
//    public static <T extends Integer> void getUperNumber(List<T> data) {
//        System.out.println("data : " + data.get(0));
//    }

    //设置下限,泛型必须是Integer类型或者其父类
    public static void getInteger(List<? super Integer> data) {
        System.out.println("data : " + data.get(0));
    }
}

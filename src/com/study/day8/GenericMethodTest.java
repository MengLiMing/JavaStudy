package com.study.day8;

public class GenericMethodTest {

    //泛型方法
    public static <E> void printArray(E[] inputArray) {
        //输出数组元素
        for (E element : inputArray) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }

    public static <E extends Comparable<E>> E[] max(E[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            for (int j = 0; j < inputArray.length-i-1; j++) {
                E x = inputArray[j];
                E y = inputArray[j+1];
                if (x.compareTo(y) > 0) {
                    inputArray[j] = y;
                    inputArray[j+1] = x;
                }
            }
        }
        return inputArray;
    }

    public static void main(String[] args) {
        Integer[] intArray = {5,2,1,4,3};
        Double[] doubleArray = {2.2,4.4,3.3,1.1};
        Character[] charArray = {'H','E','L','L','o'};

        System.out.println("整型数组元素为：");
        printArray(max(intArray));

        System.out.println( "\n双精度型数组元素为:" );
        printArray(max(doubleArray)); // 传递一个双精度型数组

        System.out.println( "\n字符型数组元素为:" );
        printArray(max(charArray)); // 传递一个字符型数组
    }
}

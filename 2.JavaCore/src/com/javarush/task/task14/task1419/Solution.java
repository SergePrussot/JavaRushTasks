package com.javarush.task.task14.task1419;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.EmptyStackException;
import java.util.List;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {
        try {
            float i = 1 / 0;

        } catch (ArithmeticException e) {
            exceptions.add(e);
            exceptions.add(new NullPointerException());
            exceptions.add(new IndexOutOfBoundsException());
            exceptions.add(new ArrayStoreException());
            exceptions.add(new ClassCastException());
            exceptions.add(new IllegalAccessException());
            exceptions.add(new ConcurrentModificationException());
            exceptions.add(new EmptyStackException());
            exceptions.add(new RuntimeException());
            exceptions.add(new Exception());
        }


    }
}

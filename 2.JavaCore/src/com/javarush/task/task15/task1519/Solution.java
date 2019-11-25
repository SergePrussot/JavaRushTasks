package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s;

        while (true) {
            s = reader.readLine();
            if (s.equals("exit"))
                break;
            try {
                if (s.contains(".")) {
                    Double d = Double.parseDouble(s);
                    print(d);
                } else {
                    int i = Integer.parseInt(s);
                    if (i > 0 && i < 128) {
                        short sh = (short) i;
                        print(sh);
                    } else
                        print(i);

                }
            } catch (NumberFormatException e) {
                print(s);
            }
        }
        reader.close();

    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}

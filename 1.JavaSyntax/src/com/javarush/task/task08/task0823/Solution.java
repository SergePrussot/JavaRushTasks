package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string1 = reader.readLine();

        String string = string1.trim().replaceAll("\\s+", " ");

        String[] str = string.split(" ");

        String[] strings = new String[str.length];

        for (int i = 0; i < str.length; i++) {
            strings[i] = str[i].substring(0, 1).toUpperCase() + str[i].substring(1);
        }

        String result = "";

        for (int i = 0; i < strings.length; i++) {
            if (i == strings.length - 1)
                result = result + strings[i];
            else result = result + strings[i] + " ";
        }

        System.out.println(result);


    }
}

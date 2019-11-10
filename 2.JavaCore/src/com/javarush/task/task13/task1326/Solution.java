package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fileReader = null;
        ArrayList<Integer> list = new ArrayList<>();

        try {
            fileReader = new BufferedReader(new InputStreamReader(new FileInputStream(reader.readLine())));
            String s = "";
            while (fileReader.ready()) {
                s += fileReader.readLine() + " ";
            }
            String[] array;
            array = s.split(" ");

            for (String value : array) {
                if (Integer.parseInt(value) % 2 == 0)
                    list.add(Integer.parseInt(value));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
                if (fileReader != null) {
                    fileReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        Collections.sort(list);
        for (Integer i : list
             ) {
            System.out.println(i);
        }

    }
}

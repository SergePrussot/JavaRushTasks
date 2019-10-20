package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 5; i ++)
            list.add(Integer.parseInt(reader.readLine()));

        Collections.sort(list);

        for (Integer i : list
             ) {
            System.out.println(i);
        }

        //напишите тут ваш код
    }
}

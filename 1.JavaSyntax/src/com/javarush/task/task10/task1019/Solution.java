package com.javarush.task.task10.task1019;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> map = new HashMap<>();

        while (true) {
            try {
                int id = Integer.parseInt(reader.readLine());
                String name = reader.readLine();
                map.put(name, id);
            } catch (Exception e) {
                break;
            }
        }

        for (Map.Entry<String, Integer> pair : map.entrySet()
        ) {
            System.out.printf("%d %s%n", pair.getValue(), pair.getKey());
        }

    }
}


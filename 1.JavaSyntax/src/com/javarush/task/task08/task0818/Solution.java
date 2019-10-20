package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        //напишите тут ваш код
        Map<String, Integer> map = new HashMap<>();

        map.put("John", 1000);
        map.put("Joe", 1500);
        map.put("Thayler", 458);
        map.put("Bill", 1400);
        map.put("Jein", 200);
        map.put("Jorge", 1600);
        map.put("Bobby", 58);
        map.put("Alex", 1400);
        map.put("Ben", 1258);
        map.put("Dave", 1400);

        return map;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        //напишите тут ваш код

        map.entrySet().removeIf(pair -> pair.getValue() < 500);
    }

    public static void main(String[] args) {

    }
}
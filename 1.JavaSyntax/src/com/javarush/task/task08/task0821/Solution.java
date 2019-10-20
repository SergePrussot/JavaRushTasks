package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        Map<String, String> map = new HashMap<>();

        map.put("John", "Lennon");
        map.put("John", "Smith");
        map.put("Jane", "Lennon");
        map.put("Max", "Lennon");
        map.put("Alex", "Lennon");
        map.put("Bobbi", "Lennon");
        map.put("Ben", "Lennon");
        map.put("Tyler", "Lennon");
        map.put("Dave", "Lennon");
        map.put("Frank", "Lennon");

        return map;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}

package com.javarush.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        Map<String, Cat> map = new HashMap<>();
        map.put("Barsik", new Cat("Barsik"));
        map.put("Murca", new Cat("Murca"));
        map.put("Rizhik", new Cat("Rizhik"));
        map.put("Vaska", new Cat("Vaska"));
        map.put("Gena", new Cat("Gena"));
        map.put("Kabisdoh", new Cat("Kabisdoh"));
        map.put("Murzik", new Cat("Murzik"));
        map.put("Pushok", new Cat("Pushok"));
        map.put("Dzherald", new Cat("Dzherald"));
        map.put("Chernish", new Cat("Cherhish"));
        return map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        Set<Cat> set = new HashSet<>();
        for (Map.Entry pair : map.entrySet()
             ) {
            set.add((Cat) pair.getValue());
        }
        return set;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}

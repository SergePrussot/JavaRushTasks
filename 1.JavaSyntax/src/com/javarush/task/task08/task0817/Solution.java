package com.javarush.task.task08.task0817;


import java.util.*;
                                                                                                                                                      
/*                                                                                                                                                       
Нам повторы не нужны                                                                                                                                                      
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("Avraam", "Lincoln");
        map.put("Julius", "Cesar");
        map.put("Iisus", "Crist");
        map.put("Iosif", "Shnideman");
        map.put("Elaiser", "Begin");
        map.put("Jina", "Lolobrigida");
        map.put("Mata", "Hari");
        map.put("David", "Begin");
        map.put("Lev", "Tolstoy");
        map.put("Bred", "Lincoln");

        return map;

    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {

        ArrayList<String> list = new ArrayList<>();
        for (Map.Entry<String, String> pair : map.entrySet()) {
            list.add(pair.getValue());

        }
        Set<String> duplicates = new HashSet<>();

        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    duplicates.add(list.get(i));
                }
            }
        }

        for (String s : duplicates
             ) {
            removeItemFromMapByValue(map, s);
        }


    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>(createMap());
        removeTheFirstNameDuplicates(map);
        for (Map.Entry<String, String> entry : map.entrySet()
             ) {
            System.out.println(entry);
        }
        


    }
}
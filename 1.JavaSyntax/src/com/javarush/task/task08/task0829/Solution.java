package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Модернизация ПО
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, String> map = new HashMap<>();
        while (true) {
            String city = reader.readLine();
            if (city.isEmpty()) {
                break;
            }
            String family = reader.readLine();


            map.put(city, family);
        }

        // Read the house number
        String cityRequest = reader.readLine();

        if (!map.isEmpty() && map.containsKey(cityRequest)) {
            String familyName = map.get(cityRequest);
            System.out.println(familyName);
        }
    }
}

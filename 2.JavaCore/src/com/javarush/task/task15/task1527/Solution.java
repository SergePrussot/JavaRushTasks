package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String link = null;
        try {
            link = reader.readLine();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        String result = null;
        if (link != null) {
            result = link.substring(link.indexOf("?") + 1);
        }

        ArrayList<String> parameters = new ArrayList<>();

        if (result != null) {
            while (result.contains("&")) {
                String parameter = result.substring(0, result.indexOf("&"));
                parameters.add(parameter);
                result = result.substring(result.indexOf("&") + 1);
            }
        }
        parameters.add(result);

        for (String s : parameters
        ) {
            if (s.contains("="))
                s = s.substring(0, s.indexOf("="));
            System.out.print(s + " ");
        }

        System.out.println();

        for (String s : parameters
        ) {
            if (s.contains("obj")) {
                String obj = s.substring(s.indexOf("=") + 1);
                try {
                    double d = Double.parseDouble(obj);
                    alert(d);
                } catch (NumberFormatException e) {
                    alert(obj);
                }
            }
        }
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}

package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = 0;
        int b = 0;
        try {
            a = Integer.parseInt(reader.readLine());
            b = Integer.parseInt(reader.readLine());
            if (a <= 0 || b <= 0 ) {
                throw new Exception();
            }
        } catch (IOException e) {
            System.out.println("Ups...");
        } finally {
            reader.close();
        }

        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        System.out.println(a);
    }
}

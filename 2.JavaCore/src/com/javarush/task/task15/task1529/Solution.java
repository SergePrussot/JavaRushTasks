package com.javarush.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Осваивание статического блока
*/

public class Solution {
    public static void main(String[] args) {

    }
    
    static {
       reset();
    }

    public static CanFly result;

    public static void reset() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int passNumber = 0;
        String parameter = null;

        try {
            parameter = reader.readLine();
            if (parameter.equals("plane")) {
                passNumber = Integer.parseInt(reader.readLine());
                result = new Plane(passNumber);
            }
            else if (parameter.equals("helicopter"))
                result = new Helicopter();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }




    }
}

package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<>();

    static {
        labels.put(3d, "jj");
        labels.put(4d, "jj");
        labels.put(5d, "jj");
        labels.put(6d, "jj");
        labels.put(7d, "jj");
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}

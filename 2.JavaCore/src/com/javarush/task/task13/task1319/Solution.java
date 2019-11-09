package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = null;

        try {
            writer = new BufferedWriter(new FileWriter(reader.readLine()));
            while (true) {
                String s = reader.readLine();
                if (s.equals("exit")) {
                    writer.write(s);
                    break;
                }

                writer.write(String.format(s + "%n"));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            reader.close();
            if (writer != null) {
                writer.close();
            }
        }
    }
}

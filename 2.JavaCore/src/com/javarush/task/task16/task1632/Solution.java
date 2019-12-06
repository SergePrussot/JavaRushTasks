package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        threads.add(new ThreadOne());
        threads.add(new ThreadTwo());
        threads.add(new ThreadThree());
        threads.add(new ThreadFour());
        threads.add(new ThreadFive());
    }

    public static void main(String[] args) {
        for (Thread t : threads
        ) {
            t.start();
        }
    }

    public static class ThreadOne extends Thread {

        @Override
        public void run() {
            while (true) {

            }

        }
    }

    public static class ThreadTwo extends Thread {
        @Override
        public void run() {
            try {
                sleep(10);
            } catch (InterruptedException e) {
                System.out.println("InterruptedException");
            }
        }
    }

    public static class ThreadThree extends Thread {
        @Override
        public void run() {
            try {
                while (true) {
                    System.out.println("Ура");
                    sleep(500);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static class ThreadFour extends Thread implements Message {

        boolean isGoing = true;

        @Override
        public void run() {
            while (isGoing) {

            }
        }

        @Override
        public void showWarning() {
            isGoing = false;
        }
    }

    public static class ThreadFive extends Thread {

        @Override
        public void run() {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int sum = 0;
            while (true) {
                try {
                    String s = reader.readLine();
                    if (s.equals("N"))
                        break;

                    int i = Integer.parseInt(s);
                    sum += i;
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(sum);
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
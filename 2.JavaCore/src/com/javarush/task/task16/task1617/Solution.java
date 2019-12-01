package com.javarush.task.task16.task1617;

/* 
Отсчет на гонках
*/

public class Solution {
    public static volatile int numSeconds = 3;

    public static void main(String[] args) {
        RacingClock clock = new RacingClock();
        try {
            Thread.sleep(3500);
            clock.interrupt();

        } catch (InterruptedException e) {

        }
        if (!clock.isInterrupted())
            System.out.print("Марш!");
    }

    public static class RacingClock extends Thread {
        public RacingClock() {
            start();
        }

        public void run() {
            int j = numSeconds;
            for (int i = j; i > 0; i--) {
                System.out.print(numSeconds + " ");
                numSeconds--;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.print("Прервано!");
                }
            }
        }
    }
}

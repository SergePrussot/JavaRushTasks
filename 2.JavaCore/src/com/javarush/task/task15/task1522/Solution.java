package com.javarush.task.task15.task1522;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Закрепляем паттерн Singleton
*/

public class Solution {
    public static Planet thePlanet;

    static {
        readKeyFromConsoleAndInitPlanet();
    }

    public static void main(String[] args) {

    }

    public static void readKeyFromConsoleAndInitPlanet() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String planet = reader.readLine();
            if (planet.equals(Planet.SUN))
                thePlanet = Sun.getInstance();
            else if (planet.equals(Planet.EARTH))
                thePlanet = Earth.getInstance();
            else if (planet.equals(Planet.MOON))
                thePlanet = Moon.getInstance();
            else
                thePlanet = null;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

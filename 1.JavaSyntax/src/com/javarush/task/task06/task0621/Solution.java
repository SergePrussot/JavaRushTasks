package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandPaName = reader.readLine();
        Cat catGrandPa = new Cat(grandPaName);

        String grandMaName = reader.readLine();
        Cat catGrandMa = new Cat(grandMaName);

        String catPapaName = reader.readLine();
        Cat catPapa = new Cat(catPapaName, null,  catGrandPa);

        String catMamaName = reader.readLine();
        Cat catMama = new Cat(catMamaName, catGrandMa);

        String catSonName = reader.readLine();
        Cat catSon = new Cat(catSonName, catMama, catPapa);

        String catDautherName = reader.readLine();
        Cat catDauther = new Cat(catDautherName, catMama, catPapa);

        System.out.println(catGrandPa);
        System.out.println(catGrandMa);
        System.out.println(catPapa);
        System.out.println(catMama);
        System.out.println(catSon);
        System.out.println(catDauther);
    }

    public static class Cat {
        private String name;
        private Cat parent;
        private Cat parent1;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat parent) {
            this.name = name;
            this.parent = parent;
        }



        public Cat(String name, Cat parent, Cat parent1) {
            this.name = name;
            this.parent = parent;
            this.parent1 = parent1;
        }

        @Override
        public String toString() {
            if (parent == null && parent1 == null)
                return "The cat's name is " + name + ", no mother, no father ";
            else if (parent != null && parent1 == null)
                return "The cat's name is " + name + ", mother is " + parent.name + ", no father ";
            else if (parent == null)
                return "The cat's name is " + name + ", no mother, father is  " + parent1.name;
            else
                return "The cat's name is " + name + ", mother is " + parent.name + ", father is  " + parent1.name;
        }
    }

}

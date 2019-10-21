package com.javarush.task.task08.task0824;

import java.util.ArrayList;

/* 
Собираем семейство
*/

public class Solution {
    public static void main(String[] args) {

        ArrayList<Human> noKidsYet = new ArrayList<>();

        Human son = new Human("Bill", true, 18, noKidsYet);
        Human daughter = new Human("Sofia", false, 25, noKidsYet);
        Human daughter1 = new Human("Carla", false, 19, noKidsYet);

        ArrayList<Human> kids = new ArrayList<>();
        kids.add(son);
        kids.add(daughter);
        kids.add(daughter1);

        Human father = new Human("Carl", true, 46, kids);
        Human mother = new Human("Jane", false, 42, kids);

        ArrayList kids1 = new ArrayList();
        kids1.add(father);

        ArrayList kids2 = new ArrayList();
        kids2.add(mother);

        Human grandMa1 = new Human("Mary", false, 76, kids1);
        Human grandPa1 = new Human("John", true, 78, kids1);
        Human grandMa2 = new Human("Serena", true, 81, kids2);
        Human grandPa2 = new Human("Dave", true, 83, kids2);

        System.out.println(son.toString());
        System.out.println(daughter.toString());
        System.out.println(daughter1.toString());
        System.out.println(mother.toString());
        System.out.println(father.toString());
        System.out.println(grandMa1.toString());
        System.out.println(grandPa1.toString());
        System.out.println(grandMa2.toString());
        System.out.println(grandPa2.toString());


    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }


        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}

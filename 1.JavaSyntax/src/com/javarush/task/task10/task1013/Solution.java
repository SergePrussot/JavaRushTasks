package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private int age;
        private int height;
        private boolean sex;
        private String name;
        private String profession;
        private boolean isDriver;


        public Human(int age, int height, boolean sex, String name, String profession, boolean isDriver) {
            this.age = age;
            this.height = height;
            this.sex = sex;
            this.name = name;
            this.profession = profession;
            this.isDriver = isDriver;
        }

        public Human(int age, int height, boolean sex, String name, String profession) {
            this.age = age;
            this.height = height;
            this.sex = sex;
            this.name = name;
            this.profession = profession;
        }

        public Human(int age, int height, boolean sex, String name) {
            this.age = age;
            this.height = height;
            this.sex = sex;
            this.name = name;
        }

        public Human(int age) {
            this.age = age;
        }

        public Human(int age, int height, boolean sex) {
            this.age = age;
            this.height = height;
            this.sex = sex;
        }

        public Human(boolean sex, String name) {
            this.sex = sex;
            this.name = name;
        }

        public Human(boolean sex, String name, boolean isDriver) {
            this.sex = sex;
            this.name = name;
            this.isDriver = true;
        }

        public Human(boolean sex, String name, String profession) {
            this.sex = sex;
            this.name = name;
            this.profession = profession;
        }

        public Human(boolean sex, String name, String profession, boolean isDriver) {
            this.sex = sex;
            this.name = name;
            this.profession = profession;
            this.isDriver = isDriver;
        }

        public Human(int age, boolean sex, String name) {
            this.age = age;
            this.sex = sex;
            this.name = name;
        }
    }
}

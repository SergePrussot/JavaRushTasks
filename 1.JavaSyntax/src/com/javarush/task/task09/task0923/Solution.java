package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};
    public static char[] consonants = new char[]{'б', 'в', 'г', 'д', 'ж', 'з', 'й', 'к', 'л', 'м', 'н', 'п', 'р', 'с', 'т', 'ф', 'х', 'ц', 'ч', 'ш', 'щ'};
    public static char[] punctuationMarks = new char[]{'.', ',', ';', ':', '!', '?', '(', ')', '"', '-'};

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        char[] chars = toArray(s);

        ArrayList<Character> vowels = new ArrayList<>();
        ArrayList<Character> consonants = new ArrayList<>();

        for (Character c : chars
        ) {
            if (isVowel(c))
                vowels.add(c);
            else if (isConsonant(c))
                consonants.add(c);
            else if (isPunctuationMark(c))
                consonants.add(c);
        }
        printLists(vowels);
        printLists(consonants);

    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char d : vowels) {  // ищем среди массива гласных
            if (c == d) {
                return true;
            }
        }
        return false;
    }

    public static boolean isPunctuationMark(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char d : punctuationMarks) {  // ищем среди массива согласных
            if (c == d) {
                return true;
            }
        }
        return false;
    }

    public static boolean isConsonant(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char d : consonants) {  // ищем среди массива согласных
            if (c == d) {
                return true;
            }
        }
        return false;
    }

    public static char[] toArray(String s) {
        return s.toCharArray();

    }

    public static void printLists(ArrayList<Character> list) {
        for (Character c : list
        ) {
            System.out.print(c + " ");
        }
        System.out.println();
    }
}
package ru.job4j.array;

public class ArrayChar {

    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = false;
        for (int i = 0, j = 0; i < word.length && j < pref.length; i++, j++) {
            if (word[i] == pref[j]) {
                result = true;
            } else if (word[i] != pref[j]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
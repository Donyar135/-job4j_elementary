package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = false;
        for (int i = 0; i < post.length; i++) {
            result = word[word.length - 1] == post[post.length - 1];
        }
        return result;
    }
}
package ru.job4j.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        int[] ar = new int[2];
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == target) {
                    ar[0] = i;
                    ar[1] = j;
                    break;
                }
            }
        }
        if (ar[0] != ar[1]) {
            return ar;
        }
        return new int[0];
    }
}
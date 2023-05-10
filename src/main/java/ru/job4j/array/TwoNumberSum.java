package ru.job4j.array;

import java.util.Arrays;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        int size = 0;
        int i = 0;
        int j = array.length - 1;
        while (i < j) {
            if (array[i] + array[j] == target) {
                array[0] = i;
                array[1] = j;
                size = 2;
                break;
            } else if (array[i] + array[j] < target) {
                i++;
            } else {
                j--;
            }
        }
        return Arrays.copyOf(array, size);
    }
}

package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        int k = 0;
        for (int i = 0; i < money - price; i += coins[k]) {
            if (money - price - i < coins[k]) {
                k++;
            }
            rsl[size] = coins[k];
            size++;
        }
        return Arrays.copyOf(rsl, size);
    }
}
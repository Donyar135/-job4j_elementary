package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static int min(int left, int right) {
        return left < right ? left : right;
    }

    public static int isEqual(int left, int right) {
        return left == right ? left : right;
    }

    public static void main(String[] args)  {
        int result = Max.max(5, 2);
        System.out.println(result);
        int result1 = Max.min(5, 2);
        System.out.println(result1);
        int result2 = Max.isEqual(5, 2);
        System.out.println(result2);
    }
}

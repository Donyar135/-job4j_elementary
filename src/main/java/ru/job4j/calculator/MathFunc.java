package ru.job4j.calculator;

public class MathFunc {
    public static int func1(int x) {
        int y = x * x + 1;
        int result3 = y;
        System.out.println(result3);
        return y;
    }

    public static void main(String[] args) {
        MathFunc.func1(100);

    }
}

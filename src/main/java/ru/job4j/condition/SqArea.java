package ru.job4j.condition;

public class SqArea {
    public static double square(double p, double k) {
        double h = p / (2 * (k + 1));
        double l = h * k;
        double s = l * h;
        return s;
    }

    public static void main(String[] args) {
        double result = SqArea.square(6, 2);
        System.out.println(" p = 4, k = 1, real = " + result);

        double result1 = SqArea.square(2, 3);
        System.out.println(" p = 2, k = 3, real = " + result1);

        double result2 = SqArea.square(5, 5);
        System.out.println(" p = 5, k = 5, real = " + result2);

        double result3 = SqArea.square(6, 4);
        System.out.println(" p = 6, k = 4, real = " + result3);
    }
}
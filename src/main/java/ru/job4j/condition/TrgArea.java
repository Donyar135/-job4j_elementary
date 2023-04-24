package ru.job4j.condition;

public class TrgArea {
    public static double area(double a, double b, double c) {
        int s;
        int p;
        p = (int) (a + b + c);
        s = (int) Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.println("area (2, 2, 2) = " + s);
        return s;
    }

    public static void main(String[] args) {
        TrgArea.area(2, 2, 2);
    }
}

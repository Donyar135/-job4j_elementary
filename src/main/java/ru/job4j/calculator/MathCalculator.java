package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double addAndDivide(double first, double second) {
        return add(first, second)
                + divide(first, second);
    }

    public static double addAllElement(double first, double second) {
        return add(first, second)
                + divide(first, second)
                + sum(first, second)
                + multiply(first, second);
    }

    public static void main(String[] args) {
        System.out.println("first = 11  second = 20 Результат расчета равен: " + sumAndMultiply(11, 20));
        System.out.println("first = 11  second = 20 Результат расчета равен: " + addAndDivide(11, 20));
        System.out.println("Cумма всех элементов: " + addAllElement(11, 20));
    }
}

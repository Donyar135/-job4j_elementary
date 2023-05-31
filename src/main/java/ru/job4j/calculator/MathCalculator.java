package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    private static int x = 5;

    public static double plusAndMinus(double first, double second) {
        return plus(first, second)
                + minus(first, x);
    }

    public double multiplyAndDivide(double first, double second) {
        return multiply(first, second)
                + divide(first, x);
    }

    public double addAllElement(double first, double second) {
        return plus(first, second)
                + minus(first, x)
                + multiply(first, second)
                + divide(first, x);
    }

    public static void main(String[] args) {
        System.out.println("first = 11  x = 5 Результат расчета равен: " + plusAndMinus(11, 20));
        MathCalculator divide = new MathCalculator();
        double result = divide.multiplyAndDivide(11, 20);
        System.out.println("first = 11  x = 5 Результат расчета равен: " + result);
        MathCalculator calculator = new MathCalculator();
        double all = calculator.addAllElement(11, 20);
        System.out.println("Cумма всех элементов: " + all);
    }
}

package ru.job4j.condition;

public class Triangle {

    public static boolean exist(double ab, double ac, double bc) {
        return ab + ac > bc && ac + bc > ab && ab + bc > ac;
    }

    public static void main(String[] args)  {
        boolean result = Triangle.exist(8, 6, 5);
        System.out.println(result);
        boolean result1 = Triangle.exist(8, 4, 3);
        System.out.println(result1);
    }
}
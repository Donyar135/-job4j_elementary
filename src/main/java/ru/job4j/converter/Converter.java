package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(150_000f);
        float dollar = Converter.rubleToDollar(2_000f);
        System.out.println("150_000f rubles are " + euro + " euro.");
        System.out.println("2_000f rubles are " + euro + " dollar.");
    }

}

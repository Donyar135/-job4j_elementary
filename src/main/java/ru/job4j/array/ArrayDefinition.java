package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {

        String[] names = new String[4];
        names[0] = "Daniyar Aldanov";
        names[1] = "Petr Arsentev";
        names[2] = "Егор Бугаенко";
        names[3] = "Олег Чергасов";

        String dani = names[0];
        String petr = names[1];
        String egor = names[2];
        String oleg = names[3];

        System.out.println(names[0]
                + " \n" + names[1]
                + " \n" + names[2]
                + " \n" + names[3]
                + " \n");

        System.out.println(dani
                + " \n" + petr
                + " \n" + egor
                + " \n" + oleg);
    }

}

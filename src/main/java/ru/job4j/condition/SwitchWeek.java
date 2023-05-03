package ru.job4j.condition;

public class SwitchWeek {
    public static String nameOfDay(int day) {
        String name;
        switch (day) {
            case 1 :
                name = "???????????";
                break;
            case 2 :
                name = "???????";
                break;
            case 3 :
                name = "?????";
                break;
            case 4 :
                name = "???????";
                break;
            case 5 :
                name = "???????";
                break;
            case 6 :
                name = "??????";
                break;
            case 7 :
                name = "???????????";
                break;
            default:
                name = "??????";
                break;
        }

        return name;
    }
}

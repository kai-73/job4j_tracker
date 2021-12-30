package ru.job4j.inheritance;

public class GeneralDeadline {
    public static String day = "1.01.2022";

    public GeneralDeadline(String dayx) {
        this.day = dayx;
    }

    public static String getDay() {
        return day;
    }

    public static void setDay(String day) {
        GeneralDeadline.day = day;
    }
}

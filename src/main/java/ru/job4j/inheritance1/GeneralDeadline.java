package ru.job4j.inheritance1;

public class GeneralDeadline {
    public static String day = "1.01.2022";

    public GeneralDeadline(String dayx) {
        this.day = dayx;
    }

    //GeneralDeadline day31 = new GeneralDeadline("31.12.2021");

    public static String getDay() {
        return day;
    }

    public static void setDay(String day) {
        GeneralDeadline.day = day;
    }
}

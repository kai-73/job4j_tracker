package ru.job4j.inheritance1;

public class Prikaz {
    private String run;

    public Prikaz(String run) {
        this.run = run;
    }

    static Prikaz fire = new Prikaz("Уволить");
    static Prikaz prize = new Prikaz("Премировать");

    public static String getPrize() {
        return prize.run;
    }

    public static String getFire() {
        return fire.run;
    }

    public static void show(String a) {
        System.out.println("Приказ на " + a);

    }

}

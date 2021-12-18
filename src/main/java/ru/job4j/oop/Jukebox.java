package ru.job4j.oop;

public class Jukebox {
    String crocodile = "Пусть бегут неуклюже";
    String sleep = "Спокойной ночи";
    String nothing = "Песня не найдена";

    public void music(int position) {
        if (position == 1) {
            System.out.println(crocodile);
        } else {
            if (position == 2) {
                System.out.println(sleep);
            } else {
                System.out.println(nothing);
            }
        }
    }

    public static void main(String[] args) {
        Jukebox song = new Jukebox();
        song.music(1);
        song.music(2);
        song.music(3);
    }
}

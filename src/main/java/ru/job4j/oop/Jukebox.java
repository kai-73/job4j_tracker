package ru.job4j.oop;

public class Jukebox {

    public void music(int position) {
        System.out.println(position == 1 ? "Пусть бегут неуклюже" : (position == 2 ? "Спокойной ночи" : "Песня не найдена"));
    }

    public static void main(String[] args) {
        Jukebox song = new Jukebox();
        song.music(1);
        song.music(2);
        song.music(3);
    }
}

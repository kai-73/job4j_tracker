package ru.job4j.io;

import java.util.Scanner;
import java.util.Random;

public class MagicBall {
    public static void main(String[] args) {
        System.out.println("Я великий оракул.Что ты хочешь узнать смертный? ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        int answer = new Random().nextInt(3);
        String result = answer == 0 ? "Да." : (answer == 1 ? "Нет." : "Может быть.");
        System.out.println(result);
    }
}

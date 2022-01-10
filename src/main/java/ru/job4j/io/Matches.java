package ru.job4j.io;

import java.util.Scanner;

public class Matches {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Игра 11.");
        boolean turn = true;
        int count = 11;
        while (count > 0) {
            String player = turn ? "Первый игрок " : "Второй игрок ";
            System.out.println(player + "введите число от 1 до 3: ");
            int matches = input.nextInt();
            if (controlOfRules(matches, count)) {
                count = outputMatchesLeft(count, matches);
                turn = !turn;
            }
        }
        outputWinner(turn);
    }

    private static boolean controlOfRules(int matches, int count) {
        if (matches < 1 || matches > 3) {
            System.out.println("Нарушение правил. Вы можете ввести только число от 1 до 3. Повторите ввод.");
            return false;
        }
        if (matches > count) {
            System.out.println("На столе осталось " + count + " спичек." + "Вы можете ввести только число от 1 до " + count);
            return false;
        }
        return true;
    }

    private static int outputMatchesLeft(int count, int matches) {
        System.out.println("На столе осталось " + (count - matches) + " спичек.");
        return count - matches;
    }

    private static void outputWinner(boolean winner) {
        if (!winner) {
            System.out.println("Выиграл первый игрок");
        } else {
            System.out.println("Выиграл второй игрок");
        }
    }
}

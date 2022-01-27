package ru.job4j.tracker;

import java.util.Scanner;

public class ConsoleInput implements Input {
    private Scanner scanner = new Scanner(System.in);

    @Override
    public String askStr(String question) {
        System.out.print(question);
        return scanner.nextLine();
    }

    @Override
    public int askInt(String question) {
        System.out.print(question);
        if (scanner.hasNextInt()) {
            return scanner.nextInt();
        } else {
            return 7;
        }
    }
}

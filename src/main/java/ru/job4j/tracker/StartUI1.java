package ru.job4j.tracker;

import java.time.format.DateTimeFormatter;

/**
 * Этот класс управляет меню.
 */
public class StartUI1 {

    public static void main(String[] args) {
        Item dateTime = new Item();
        Item item = new Item("Oleg Romanov", 1);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
        String outPut = item.getCreated().format(formatter);
        System.out.println(outPut);
        System.out.println(item);
    }

}

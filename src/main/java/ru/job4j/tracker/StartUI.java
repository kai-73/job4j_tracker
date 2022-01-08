package ru.job4j.tracker;

import java.time.format.DateTimeFormatter;

public class StartUI {

    public static void main(String[] args) {
        Item dateTime = new Item();
        Item item = new Item();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
        String outPut = item.getCreated().format(formatter);
        System.out.println(outPut);
        System.out.println(item);
    }

}

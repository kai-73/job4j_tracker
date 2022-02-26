package ru.job4j.collection.exercises;

import java.util.List;

public class CheckerAhdGetter01 {
    public static String getElement(List<String> list) {
        if (list.isEmpty()) {
            return "";
        } else {
            return list.get(0);
        }
    }
}
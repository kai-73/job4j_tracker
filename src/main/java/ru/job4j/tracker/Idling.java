package ru.job4j.tracker;

public class Idling implements UserAction  {

    @Override
    public String name() {
        return "Холостой проход";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println(System.lineSeparator() + "Ошибка вода. Введите число.");
        return true;
    }
}

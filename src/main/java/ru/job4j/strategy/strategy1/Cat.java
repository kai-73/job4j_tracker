package ru.job4j.strategy.strategy1;

public class Cat implements Animal {
    private int number;

    public Cat(int number) {
        this.number = number;

    }

    public Cat() {
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String sound() {
        return getClass().getSimpleName() + " - Мяу-мяу";
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Имя класса - \"" + getClass().getSimpleName() + "\"," + " number = " + "'" + number + "'";
    }
}

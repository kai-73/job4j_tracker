package ru.job4j.strategy.strategy1;

public class Dog implements Animal {

    private int number;

    public Dog(int number) {
        this.number = number;
    }

    public Dog() {
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String sound() {
        return getClass().getSimpleName() + " - Гав-гав";
    }

    public void setNumber(int number) {
        this.number = number;

    }

    @Override
    public String toString() {
        return "Имя класса - \"" + getClass().getSimpleName() + "\"," + " number = " + "'" + number + "'";
    }
}

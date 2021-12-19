package ru.job4j.oop;

public class Cat {
    private String food;
    private String name;

    public void show() {
        System.out.println("Котик по имени " + this.name + " кушает " + this.food + ".");
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public void giveNick(String nick) {
        this.name = nick;
    }

    public static void main(String[] args) {
        Cat gav = new Cat();
        Cat black = new Cat();
        gav.eat("котлету");
        gav.giveNick("Гав");
        gav.show();
        black.eat("рыбу");
        black.giveNick("Черныш");
        black.show();
    }
}

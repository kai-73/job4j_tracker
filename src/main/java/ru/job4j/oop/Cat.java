package ru.job4j.oop;

/**
 * @Раздел Блок 2. ООП / 1. Классы и объекты
 * @Задание 1.5. Поля объекта. [166083#271543] (ver.3)
 * @Описание 1. Создайте дополнительное поле private String name. Это поле должно содержать кличку котика.
 * 2. Создайте метод public void giveNick(String nick). Этот метод должен записывать переменную nick в поле name.
 * 3. Измените метод void show() так, чтобы при его вызове в консоль выводилась информация: имя котика и что он ел.
 * 4. Загрузите код в github. Оставьте ссылку на коммит.
 * @author Oleg Ronanov
 * @since 19.12.2021
 * @version 1
 */
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

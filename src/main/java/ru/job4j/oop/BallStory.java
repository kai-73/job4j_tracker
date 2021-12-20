package ru.job4j.oop;

public class BallStory {

    public static void main(String[] args) {
        Ball kolobok1 = new Ball();
        Hare hare = new Hare();
        Fox fox = new Fox();
        Wolf wolf = new Wolf();
        hare.tryEat(kolobok1);
        fox.tryEat(kolobok1);
        wolf.tryEat(kolobok1);

    }
}

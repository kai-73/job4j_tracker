package ru.job4j.poly.animal.animalinterface;

public class Cow implements Anima {

    @Override
    public void sound() {
        System.out.println(getClass().getSimpleName() + " произносит звук: Му-му.");
    }

}

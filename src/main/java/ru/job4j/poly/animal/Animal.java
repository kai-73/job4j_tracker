package ru.job4j.poly.animal;

public class Animal {
      String nameClass = getClass().getSimpleName();

    public void sound() {
        System.out.println(nameClass + " - издает какой-то звук.");
        System.out.println(Animal.class);
    }
}



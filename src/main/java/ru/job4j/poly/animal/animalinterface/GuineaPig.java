package ru.job4j.poly.animal.animalinterface;

public class GuineaPig implements Anima {
    @Override
    public void sound() {
        System.out.println(getClass().getSimpleName() + " громко пищит для привлечения внимания.");
    }
}

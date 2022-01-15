package ru.job4j.poly.animal.animalinterface;

public class PolyUsage {
    public static void main(String[] args) {
        Anima cow = new Cow();
        Anima dog = new Dog();
        Anima goose = new Goose();
        Anima guineaPig = new GuineaPig();

        Anima[] animals = new Anima[]{cow, goose, dog, goose};
        for (Anima a : animals) {
            a.sound();
        }
    }
}

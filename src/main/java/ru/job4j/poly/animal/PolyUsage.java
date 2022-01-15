package ru.job4j.poly.animal;

public class PolyUsage {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal domesticAnimal = new DomesticAnimal();
        Animal pet = new Pet();
        Animal[] animals = new Animal[]{animal, domesticAnimal, pet};
        for (Animal a : animals) {
            a.sound();
        }
    }
}

package ru.job4j.strategy.strategy1;

public class Context {

    public void print(Animal animal) {
        System.out.println(animal.toString());
    }

    public static void main(String[] args) {
        Context context = new Context();
        Animal[] animals = new Animal[1000];
        int count = 0;
        for (int i = 0; i < animals.length; i++) {
            if (i % 2 == 0) {
                Dog dog = new Dog();
                dog.setNumber(count);
                animals[i] = dog;
            } else {
                Cat cat = new Cat();
                cat.setNumber(count);
                animals[i] = cat;

            }
            Animal animal = animals[i];
            context.print(animal);
            System.out.println(animal.getNumber() + "-" + animals[i].sound());
            count++;
        }
    }
}

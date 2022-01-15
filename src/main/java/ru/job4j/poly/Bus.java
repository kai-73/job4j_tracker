package ru.job4j.poly;

public class Bus implements Vehicle, Transport {

    @Override
    public void drive() {
        System.out.println("Автобус № 31: Москва  - Есентуки");
    }

    @Override
    public void passengers(int number) {
        System.out.println("Количество пассажиров - " + number);
    }

    @Override
    public float refuel(int amount) {
        float priceRub = 45.9f;
        return amount * priceRub;
    }

    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " - перемещается по дороге.");
    }

    @Override
    public void fuel() {
        System.out.println(" бензин.");
    }
}

package ru.job4j.poly;

public class Bus implements Transport {

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
}

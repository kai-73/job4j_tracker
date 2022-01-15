package ru.job4j.poly;

public class VehicleUsage {
    public static void main(String[] args) {
        Vehicle airplane = new Airplane();
        Vehicle bus = new Bus();
        Vehicle train = new Train();

        Vehicle[] vehicles = new Vehicle[] {airplane, bus, train};
        for (Vehicle a : vehicles) {
            a.move();
            System.out.print(a.getClass().getSimpleName() + " - в качестве топлива использует ");
            a.fuel();
        }
    }
}

package ru.job4j.oop;

public class Computer {

    private boolean multiMonitor;
    private int ssd;
    private String cpu;

    public Computer() {
    }

    public Computer(boolean monitor, int disk, String proc) {
        this.multiMonitor = monitor;
        this.ssd = disk;
        this.cpu = proc;
    }

    public Computer(int ssd, String cpu) {
        this.ssd = ssd;
        this.cpu = cpu;
    }

    public Computer(boolean multiMonitor, double ssd, String cpu) {
        this.multiMonitor = multiMonitor;
        this.ssd = (int) ssd;
        this.cpu = cpu;
    }

    public void printInfo() {
        System.out.println("Много мониторов: " + multiMonitor);
        System.out.println("SSD: " + ssd + " GB");
        System.out.println("Модель CPU: " + cpu);
        System.out.println();
    }

    public static void main(String[] args) {
        Computer first = new Computer();
        Computer second = new Computer(true, 250, "Pentium");
        first.printInfo();
        second.printInfo();
        Computer third = new Computer(256, "AMD Ryzen 5 3600");
        third.printInfo();
        Computer forth = new Computer(true, 512.0, "AMD Ryzen 7 3700X");
        forth.printInfo();
    }
}
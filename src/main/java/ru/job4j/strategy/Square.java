package ru.job4j.strategy;

public class Square implements Shape {
    @Override
    public void draw() {
        String ln = System.lineSeparator();
        System.out.println("    ^   " + ln
                         + "   / \\ " + ln
                         + "  /___\\" + ln);
    }
}

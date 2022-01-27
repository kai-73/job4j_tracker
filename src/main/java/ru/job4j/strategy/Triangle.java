package ru.job4j.strategy;

public class Triangle implements Shape {
    @Override
    public void draw() {
        String ln = System.lineSeparator();
        System.out.println(" ________" + ln
                         + "|        |" + ln
                         + "|        |" + ln
                         + "|________|" + ln);
    }
}

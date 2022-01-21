package ru.job4j.primeri;

public class Circle {
    private double radius;
    private String color;

    public Circle(double r) {
        radius = r;
    color = "красный";
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }
}

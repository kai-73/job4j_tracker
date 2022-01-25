package ru.job4j.strategy;

public class Paint {
    public static void draw(Shape shape) {
        System.out.println(shape.draw());
    }

    public static void main(String[] args) {
        Paint context = new Paint();
        Shape triangle = new Triangle();
        Shape square = new Square();
        draw(triangle);
        draw(square);
    }
}

package ru.job4j.strategy;

public class Paint {

    public void draw(Shape shape) {
        shape.draw();
    }

    Shape[] array = new Shape[1000];

    public Shape[] add(Shape shape) {
        Shape[] shapes = new Shape[1000];
        return null;
    }

    public static void main(String[] args) {
        Paint paint = new Paint();
        paint.draw(new Triangle());
        paint.draw(new Square());
    }
}

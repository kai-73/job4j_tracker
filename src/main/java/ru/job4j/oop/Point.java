/**
 * @Раздел Блок 2. ООП / 1.2.1. Классы и объекты.
 * @Задание 2.1. Рефакторинг - Расстояние между точками. [#122587]
 * @Описание Давайте вернемся к заданию "расстояние между точками в системе координат".
 * В этом задании мы перепишем код в классе Point таким образом,
 * чтобы он стал использовать объекты.
 * Любое изменение кода, которое связано с улучшением его использования называется рефакторинг кода.
 * У нас есть класс с методом, который вычисляет расстояние по точкам x1 x2 y1 y2.
 * @author Oleg Romanov
 * @since 24.12.2021
 * @version 1
 */
package ru.job4j.oop;
import static java.lang.Math.*;

public class Point {
    private int x, y;

    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    public double distance(Point that) {
        return sqrt(pow(that.x - this.x, 2) + pow(that.y - this.y, 2));
    }

    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        System.out.println(a.distance(b));
    }
}

/**
 * @Раздел Блок 2. ООП / 1.2.1. Классы и объекты.
 * @Задание 2.1. Рефакторинг - Расстояние между точками. [#122587]
 * 4. Расстояние между точками в трехмерном пространстве. [#122643]
 * @Описание Давайте вернемся к заданию "расстояние между точками в системе координат".
 * В этом задании мы перепишем код в классе Point таким образом,
 * чтобы он стал использовать объекты.
 * Любое изменение кода, которое связано с улучшением его использования называется рефакторинг кода.
 * У нас есть класс с методом, который вычисляет расстояние по точкам x1 x2 y1 y2.
 * @author Oleg Romanov
 * @since 24.12.2021
 * @version 1
 */
package ru.job4j.condition;
import static java.lang.Math.*;

public class Point {
    private int x;
            int y;
            int z;

    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Point(int one, int two, int three) {
        this.x = one;
        this.y = two;
        this.z = three;
    }

    public double distance(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }

    public double distance3d(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2) + pow(this.z - that.z, 2));
    }
}

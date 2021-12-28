package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class TriangleTest {

    @Test
    public void areaPointA00PointB40PointC04() {
        Point a = new Point(0, 0);
        Point b = new Point(4, 0);
        Point c = new Point(0, 4);
        Triangle triangle = new Triangle(a, b, c);
        double rsl = triangle.area();
        double expected = 8;
        Assert.assertEquals(expected, rsl, 0.01);
    }

    @Test
    public void areaPointA00PointB04PointC40() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 4);
        Point c = new Point(4, 0);
        Triangle triangle = new Triangle(a, b, c);
        double rsl = triangle.area();
        double expected = 8;
        Assert.assertEquals(expected, rsl, 0.01);
    }

    @Test
    public void areaPointA00PointB02PointC23() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        Point c = new Point(2, 2);
        Triangle triangle = new Triangle(a, b, c);
        double rsl = triangle.area();
        double expected = 3.11;
        Assert.assertEquals(expected, rsl, 0.01);
    }

    @Test
    public void areaPointA00PointB00PointC20() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 0);
        Point c = new Point(2, 0);
        Triangle triangle = new Triangle(a, b, c);
        double rsl = triangle.area();
        double expected = -1;
        Assert.assertEquals(expected, rsl, 0.01);
    }

    @Test
    public void areaPointA00PointBminus20PointC20() {
        Point a = new Point(0, 0);
        Point b = new Point(-2, 0);
        Point c = new Point(2, 0);
        Triangle triangle = new Triangle(a, b, c);
        double rsl = triangle.area();
        double expected = -1;
        Assert.assertEquals(expected, rsl, 0.01);
    }

    @Test
    public void areaPoint000000() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 0);
        Point c = new Point(0, 0);
        Triangle triangle = new Triangle(a, b, c);
        double rsl = triangle.area();
        double expected = -1;
        Assert.assertEquals(expected, rsl, 0.01);
    }
}
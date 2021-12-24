package ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20then2() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double expected = 2;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when03to25then2point82() {
        Point a = new Point(0, 3);
        Point b = new Point(2, 5);
        double expected = 2.82;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when01to23then2point82() {
        Point a = new Point(0, 1);
        Point b = new Point(2, 3);
        double expected = 2.82;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when01to67then8point48() {
        Point a = new Point(0, 1);
        Point b = new Point(6, 7);
        double expected = 8.48;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}
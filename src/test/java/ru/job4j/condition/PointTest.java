package ru.job4j.condition;

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

    @Test
    public void when000to111then1Point73() {
        Point a = new Point(0, 0, 0);
        Point b = new Point(1, 1, 1);
        double expected = 1.732;
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when000to200then2() {
        Point a = new Point(0, 0, 0);
        Point b = new Point(2, 0, 0);
        double expected = 2;
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when333to005then4Point69() {
        Point a = new Point(3, 3, 3);
        Point b = new Point(0, 0, 5);
        double expected = 4.690;
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when321to123then2Point82() {
        Point a = new Point(3, 2, 1);
        Point b = new Point(1, 2, 3);
        double expected = 2.828;
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}
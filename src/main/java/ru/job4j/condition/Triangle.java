package ru.job4j.condition;

import ru.job4j.condition.Point;

public class Triangle {
    private Point first;
    private Point second;
    private Point third;

    public Triangle(Point ap, Point bp, Point cp) {
        this.first = ap;
        this.second = bp;
        this.third = cp;
    }

    public double semiPerimetr(double a, double b, double c) {
        return (a + b + c) / 2;
    }

    public boolean exist(double ab, double ac, double bc) {
        return ab + ac > bc && ac + bc > ab && ab + bc > ac;
    }

    public double area() {
        double result = -1;
        double ab = first.distance(second);
        double ac = first.distance(third);
        double bc = second.distance(third);
        System.out.println("ab: " + ab + ", ac: " + ac + ", bc: " + bc);
        if (this.exist(ab, ac, bc)) {
            double per = semiPerimetr(ab, ac, bc);
            return Math.sqrt(per * (per - ab) * (per - ab) * (per - bc));
        }
        return result;
    }
}

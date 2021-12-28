package ru.job4j.condition;

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

    public boolean degenerate(Point first, Point second, Point third) {
       int rsl = (first.getX() - third.getX()) * (second.getY() - third.getY()) - (second.getX() - third.getX()) * (first.getY() - third.getY());
       int a = first.getX() - third.getX();
       int b = second.getY() - third.getY();
       int c = a * b;
       int d = second.getX() - third.getX();
       int e = first.getY() - third.getY();
       int f = d * e;
       int h = c - f;
       return  rsl != 0;
    }

    public boolean exist(double ab, double ac, double bc) {
        return ab + ac > bc && ac + bc > ab && ab + bc > ac;
    }

    public double area() {
        double ab = first.distance(second);
        double ac = first.distance(third);
        double bc = second.distance(third);
        System.out.println("ab: " + ab + ", ac: " + ac + ", bc: " + bc);
        if (this.exist(ab, ac, bc) && this.degenerate(this.first, second, third)) {
            double per = semiPerimetr(ab, ac, bc);
            return Math.sqrt(per * (per - ab) * (per - ab) * (per - bc));
        }
        return -1;
    }
}

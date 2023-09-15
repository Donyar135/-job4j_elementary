package ru.job4j.condition;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Point {
    private int x;
    private int y;
    private int z;

    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double distance(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }

    public double distance3d(Point that) {
        return sqrt(pow(this.z - that.z, 2)) + distance(that);
    }

    public static void main(String[] args) {
        Point a = new Point(3, 0, 7);
        Point b = new Point(0, 2, 1);
        double dist = a.distance(b);
        double dist1 = a.distance3d(b);
        System.out.println(dist);
        System.out.println(dist1);
    }
}
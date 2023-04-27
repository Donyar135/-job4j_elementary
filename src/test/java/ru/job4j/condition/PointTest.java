package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void when00to20then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);

        expected = 2.8284271247461903;
        x1 = 0;
        y1 = 2;
        x2 = 2;
        y2 = 0;
        out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);

        expected = 0;
        x1 = 2;
        y1 = 0;
        x2 = 2;
        y2 = 0;
        out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);

        expected = 2.23606797749979;
        x1 = 1;
        y1 = 3;
        x2 = 2;
        y2 = 5;
        out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}
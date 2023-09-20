package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when12to34then2dot82() {
        double expected = 2.82;
        Point a = new Point(1, 2);
        Point b = new Point(3, 4);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when02to20then2dot83() {
        double expected = 2.83;
        Point a = new Point(0, 2);
        Point b = new Point(2, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when13to25then2dot24() {
        double expected = 2.24;
        Point a = new Point(1, 3);
        Point b = new Point(2, 5);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when026to215then2dot44() {
        double expected = 2.44;
        Point a = new Point(0, 2, 6);
        Point b = new Point(2, 1, 5);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when133to255then3() {
        double expected = 3;
        Point a = new Point(1, 3, 3);
        Point b = new Point(2, 5, 5);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}
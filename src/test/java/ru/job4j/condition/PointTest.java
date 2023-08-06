package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void when123to340then4dot12() {
        double expected = 4.12;
        Point a = new Point(1, 2, 3);
        Point b = new Point(3, 4, 0);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }

        @Test
        public void when026to205then3() {
            double expected = 3.0;
            Point a = new Point(0, 2, 6);
            Point b = new Point(2, 0, 5);
            double out = a.distance3d(b);
            Assert.assertEquals(expected, out, 0.01);
        }

        @Test
        public void when207to204then3() {
            double expected = 3.0;
            Point a = new Point(2, 0, 7);
            Point b = new Point(2, 0, 4);
            double out = a.distance3d(b);
            Assert.assertEquals(expected, out, 0.01);
        }

        @Test
        public void when132to255then3dot74() {
            double expected = 3.74;
            Point a = new Point(1, 3, 2);
            Point b = new Point(2, 5, 5);
            double out = a.distance3d(b);
            Assert.assertEquals(expected, out, 0.01);
        }

}
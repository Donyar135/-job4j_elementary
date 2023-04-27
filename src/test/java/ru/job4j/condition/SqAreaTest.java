package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void whenP6K2Square2() {
        double expected = 2;
        double p = 6;
        double k = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);

        expected = 0.1875;
        Assert.assertEquals(expected, SqArea.square(2, 3), 0.01);

        expected = 0.8680555555555557;
        Assert.assertEquals(expected, SqArea.square(5, 5), 0.01);

        expected = 1.6875;
        Assert.assertEquals(expected, SqArea.square(6, 3), 0.01);
    }


}
package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax5To3Then5() {
        int left = 5;
        int right = 3;
        int result = Max.max(left, right);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax4To4Then4() {
        int left = 4;
        int right = 4;
        int result = Max.max(left, right);
        int expected = 4;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax6To5To4Then6() {
        int first = 5;
        int second = 6;
        int third = 4;
        int result = Max.max(first, second, third);
        int expected = 6;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax4To3To2To1Then4() {
        int first = 4;
        int second = 3;
        int third = 2;
        int fours = 1;
        int result = Max.max(first, second, third, fours);
        int expected = 4;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax9To5To2To7Then9() {
        int first = 5;
        int second = 2;
        int third = 9;
        int fours = 7;
        int result = Max.max(first, second, third, fours);
        int expected = 9;
        assertThat(result).isEqualTo(expected);
    }
}
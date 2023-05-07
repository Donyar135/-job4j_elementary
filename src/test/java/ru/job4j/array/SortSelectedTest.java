package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort1037() {
        int[] data = new int[] {10, 3, 7};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {3, 7, 10};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort27412411() {
        int[] data = new int[] {27, 4, 12, 40, 1};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 4, 12, 27, 40};
        assertThat(result).containsExactly(expected);
    }
}
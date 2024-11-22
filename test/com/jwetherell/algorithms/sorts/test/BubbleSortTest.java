package com.jwetherell.algorithms.sorts;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BubbleSortsTest {

    @Test
    public void testAscendingOrder() {
        Integer[] unsorted = {5, 3, 8, 6, 2};
        Integer[] expected = {2, 3, 5, 6, 8};
        assertArrayEquals(expected, BubbleSort.sort(unsorted));
    }

    @Test
    public void testEmptyArray() {
        Integer[] unsorted = {};
        Integer[] expected = {};
        assertArrayEquals(expected, BubbleSort.sort(unsorted));
    }

    @Test
    public void testSingleElement() {
        Integer[] unsorted = {42};
        Integer[] expected = {42};
        assertArrayEquals(expected, BubbleSort.sort(unsorted));
    }

    @Test
    public void testAlreadySorted() {
        Integer[] unsorted = {1, 2, 3, 4, 5};
        Integer[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, BubbleSort.sort(unsorted));
    }

    @Test
    public void testArrayWithDuplicates() {
        Integer[] unsorted = {3, 1, 4, 1, 5};
        Integer[] expected = {1, 1, 3, 4, 5};
        assertArrayEquals(expected, BubbleSort.sort(unsorted));
    }
}
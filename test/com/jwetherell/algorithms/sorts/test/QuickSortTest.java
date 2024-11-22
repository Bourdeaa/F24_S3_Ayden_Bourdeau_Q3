import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QuickSortTest {

    @Test
    public void testQuickSortRegularCase() {
        Integer[] input = {7, 2, 1, 6, 8, 5, 3, 4};
        Integer[] expected = {1, 2, 3, 4, 5, 6, 7, 8};
        Integer[] result = QuickSort.sort(QuickSort.PIVOT_TYPE.RANDOM, input);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testQuickSortAlreadySorted() {
        Integer[] input = {1, 2, 3, 4, 5};
        Integer[] expected = {1, 2, 3, 4, 5};
        Integer[] result = QuickSort.sort(QuickSort.PIVOT_TYPE.FIRST, input);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testQuickSortReverseOrder() {
        Integer[] input = {5, 4, 3, 2, 1};
        Integer[] expected = {1, 2, 3, 4, 5};
        Integer[] result = QuickSort.sort(QuickSort.PIVOT_TYPE.MIDDLE, input);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testQuickSortWithDuplicates() {
        Integer[] input = {5, 1, 3, 5, 5, 2};
        Integer[] expected = {1, 2, 3, 5, 5, 5};
        Integer[] result = QuickSort.sort(QuickSort.PIVOT_TYPE.RANDOM, input);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testQuickSortSingleElement() {
        Integer[] input = {8};
        Integer[] expected = {8};
        Integer[] result = QuickSort.sort(QuickSort.PIVOT_TYPE.FIRST, input);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testQuickSortEmptyArray() {
        Integer[] input = {};
        Integer[] expected = {};
        Integer[] result = QuickSort.sort(QuickSort.PIVOT_TYPE.RANDOM, input);
        assertArrayEquals(expected, result);
    }
}

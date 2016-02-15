package algorithms;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

/**
 * @author omkar
 * @since 2/14/16
 */
public class TestInsertionSort {

    /**
     * Case 1 : Input array has only one element
     */
    @Test
    public void test_insertionSortWithInputHavingOneElement() {
        int[] input = new int[]{25};
        assertArrayEquals(input, InsertionSort.sort(input));
    }

    /**
     * Case 2 : Input array has multiple elements
     */
    @Test
    public void test_insertionSortWithMultipleElementInput() {
        int[] input = new int[]{3,4,1,5,6};
        int[] expectedOutput = new int[]{1,3,4,5,6};
        assertArrayEquals(expectedOutput, InsertionSort.sort(input));
    }

    /**
     * Case 3 : Input array is already sorted
     */
    @Test
    public void test_insertionSortWithSortedInput() {
        int[] sortedInput = new int[]{6,7,8,9,10};
        assertArrayEquals(sortedInput, InsertionSort.sort(sortedInput));
    }
}
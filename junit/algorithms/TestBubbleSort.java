package algorithms;

import static org.junit.Assert.*;
import org.junit.Test;


/**
 * JUnit to test BubbleSort.java
 * @author Omkar Chavan
 * @since 3/20/16
 */
public class TestBubbleSort {
    /**
     * Test Bubble Sort With null data set
     */
    @Test
    public void testBubbleSortWithNullDataSet() {
        int[] data = null;
        int[] actualSortedData = new BubbleSort().sort(data);
        assertNull(actualSortedData);
    }

    /**
     * Test Bubble Sort With single element
     */
    @Test
    public void testBubbleSortWithSingleElementDataSet() {
        int[] data = { 7 };
        int[] actualSortedData = new BubbleSort().sort(data);
        assertEquals(data, actualSortedData);
    }

    /**
     * Test Bubble Sort With data set
     * having more than one element
     */
    @Test
    public void testBubbleSortWithLargeDataSet() {
        // Data before sorting
        int[] data = {2,5,1,7,4,3,7};

        int[] expectedSortedData = { 1,2,3,4,5,7,7 };
        int[] actualSortedData = new BubbleSort().sort(data);
        // Assert that sorting method works
        assertArrayEquals("Comparing Expected And Actual Sorted Data",
                expectedSortedData, actualSortedData);
        // Verify random element in the array is what you expect
        assertEquals(5, actualSortedData[4]);
    }
}

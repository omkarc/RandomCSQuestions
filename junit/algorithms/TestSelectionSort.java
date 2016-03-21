package algorithms;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

/**
 * JUnit to test SelectionSort.java
 * @author Omkar Chavan
 * @since 3/20/16
 */
public class TestSelectionSort {
    /**
     * Test Selection Sort With null data set
     */
    @Test
    public void testSelectionSortWithNullDataSet() {
        int[] data = null;
        int[] actualSortedData = new SelectionSort().sort(data);
        assertNull(actualSortedData);
    }

    /**
     * Test Selection Sort With single element
     */
    @Test
    public void testSelectionSortWithSingleElementDataSet() {
        int[] data = { 7 };
        int[] actualSortedData = new SelectionSort().sort(data);
        assertEquals(data, actualSortedData);
    }

    /**
     * Test Selection Sort With data set
     * having more than one element
     */
    @Test
    public void testSelectionSortWithLargeDataSet() {
        // Data before sorting
        int[] data = {2,5,1,7,4,3,7};

        int[] expectedSortedData = { 1,2,3,4,5,7,7 };
        int[] actualSortedData = new SelectionSort().sort(data);
        // Assert that sorting method works
        assertArrayEquals("Comparing Expected And Actual Sorted Data",
                expectedSortedData, actualSortedData);
        // Verify random element in the array is what you expect
        assertEquals(5, actualSortedData[4]);
    }

}
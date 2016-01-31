/**
 * 
 */
package algorithms;

import static org.junit.Assert.*;

import org.junit.Test;

import algorithms.BinarySearch;

/**
 * @author Omkar C
 * @since January 30, 2016
 */
public class TestBinarySearch {
	private static final int notFound = -1;
	
	/**
	 * Case 1 : source has only one element which 
	 * is not equal to target hence expecting -1 
	 */
	@Test
	public void testIndexOf_WithSingleSourceElemNotContainingTarget() {
		assertEquals(notFound, 
				BinarySearch.indexOf(new int[]{20}, 2));
	}
	
	/**
	 * Case 2 : source has only one element which 
	 * is equal to target hence expecting 0 
	 */
	@Test
	public void testIndexOf_WithSingleSourceElemContainingTarget() {
		assertEquals(0, 
				BinarySearch.indexOf(new int[]{2}, 2));
	}
	
	/**
	 * Case 3 : source has multiple elements such 
	 * that it does not contain target hence expecting -1 
	 */
	@Test
	public void testIndexOf_WithMultipleSourceElemsNotContainingTarget() {
		assertEquals(notFound, 
				BinarySearch.indexOf(new int[]{1, 10, 20, 45, 67}, 2));
	}
	

	/**
	 * Case 4 : source has multiple elements such 
	 * that it does contain target hence expecting indexOf target 
	 */
	@Test
	public void testIndexOf_WithMultipleSourceElemsContainingTarget() {
		assertEquals(2, 
				BinarySearch.indexOf(new int[]{1, 10, 20, 25, 75, 87}, 20));
	}

}

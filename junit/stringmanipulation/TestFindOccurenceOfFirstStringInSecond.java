/**
 * 
 */
package stringmanipulation;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * JUnit to test FindOccurenceOfFirstStringInSecond.java
 * @author Omkar C 
 * @since Jan 30, 2016
 *
 */
public class TestFindOccurenceOfFirstStringInSecond {

	/**
	 * Test Case 1 : Source and Target both contain 
	 * exactly the same single character
	 */
	@Test
	public void testIsPresent_WithSameSingleCharacterInSourceAndTarget() {
		assertTrue(FindOccurenceOfFirstStringInSecond.isPresent("H", "H"));
	}
	
	/**
	 * Test Case 2 : Source and Target both contain 
	 * different single characters
	 */
	@Test
	public void testIsPresent_WithDifferentSingleCharactersInSourceAndTarget() {
		assertFalse(FindOccurenceOfFirstStringInSecond.isPresent("H", "a"));
	}
	
	/**
	 * Test Case 3 : Source and Target are both greater 
	 * than 1 character such that target is present in source
	 */
	@Test
	public void testIsPresent_forTargetPresentInSource() {
		assertTrue(FindOccurenceOfFirstStringInSecond.isPresent("Hello There! ", "Hello"));
	}
	
	/**
	 * Test Case 4 : Source and Target are both greater 
	 * than 1 character such that target is not present in source
	 */
	@Test
	public void testIsPresent_forTargetNotPresentInSource() {
		assertFalse(FindOccurenceOfFirstStringInSecond.isPresent("Hello There! ", "hey"));
	}

}

/**
 * 
 */
package algorithms;

/**
 * @author Omkar C
 * @since January 30, 2016
 * One of the popular problems in CS Fundamentals : 
 * Binary Search being implemented in Java
 */
public class BinarySearch {
	
	/**
	 * Method takes an int[] source and int target and returns 
	 * index at which target is found in source. If target is not 
	 * found then method returns -1
	 * Assumptions : Source is not null i.e. contains atleast one element
	 */
	public static int indexOf(int[] source, int target) {
		int notFound = -1;
		int start = 0;
		int end = source.length-1;
		while(start <= end) {
			int mid = start +(end-start)/2;
			if(target < source[mid]) {
				end = mid-1;
			} else if(target > source[mid]) {
				start = mid+1;
			} else {
				return mid;
			}
		}
		return notFound;
	}
}
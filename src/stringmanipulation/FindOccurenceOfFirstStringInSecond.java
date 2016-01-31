/**
 * 
 */
package stringmanipulation;

/**
 * @author Omkar C
 * @since January 30, 2016
 * Statement : Given two strings : data and target, 
 * write a method to determine if target occurs in source 
 * eg: Data= "hello" and target="Hello, there!" -> returns true
 */
public class FindOccurenceOfFirstStringInSecond {
	
	/**
	 * Assumptions: 
	 * 1] Both source and target are non-null with length > 1
	 * @param source
	 * @param target
	 * @return true iff target is present in source 
	 */
	public static boolean isPresent(String source, String target) {
		char[] sourceArr = source.toCharArray();
		char[] targetArr = target.toCharArray();
		int count = 0;
		for(int i=0, j =i; i < sourceArr.length && j < targetArr.length; i++) {
			if(targetArr[j] == sourceArr[i]) {
				count++;
				j++;
			}
		}
		return count == target.length();
	}
}
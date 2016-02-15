package algorithms;

import java.util.Arrays;

/**
 * @author Omkar C
 * @since 2/14/16
 * Insertion Sort being implemented in Java
 */
public class InsertionSort {

    /*
     * Assumptions : Input array is non-null with atleast 1 element
     *
     */
    public static int[] sort(int[] _input){
        for (int i = 1; i < _input.length; i++) {
            int prevIndex = i - 1;
            int currValue = _input[i];
            while (prevIndex >= 0 && _input[prevIndex] > currValue) {
                _input[prevIndex + 1] = _input[prevIndex];
                prevIndex--;
            }
            _input[prevIndex + 1] = currValue;
        }
        return _input;
    }
}

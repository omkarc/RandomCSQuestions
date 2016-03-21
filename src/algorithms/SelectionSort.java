package algorithms;

/**
 * Java Implementation of Selection Sort
 * @author Omkar Chavan
 * @since 3/20/16
 */
public class SelectionSort {

    // In-place sorting takes constant amount of extra memory

    /*
     * Pseudo Code
     * 1] Start with two pointers
     * 2] Assume the first element to be smallest and compare it with next element
     * 3] If next element < current element then swap it
     * 4] Continue until you reach the end of the array
     * Worst Case RunTime : O(n^2)
     */
    public int[] sort(int[] _data) {
        if (_data == null || _data.length <= 0) {
            return null;
        } else if (_data.length == 1) {
            return _data;
        } else {
            // Outer loop goes upto second-last element
            for (int i = 0; i < _data.length - 1; i++) {
                // Inner loop starts at i+1 and goes upto last element
                for (int j = i + 1; j < _data.length; j++) {
                    // If new min is found then swap!
                    if (_data[j] < _data[i]) {
                        int newMin = _data[j];
                        _data[j] = _data[i];
                        _data[i] = newMin;
                    }
                }
            }
            return _data;
        }
    }
}
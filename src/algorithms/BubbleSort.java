package algorithms;

/**
 * Java Implementation of Bubble Sort
 * @author Omkar Chavan
 * @since 03/20/2016
 */
public class BubbleSort {

    /**
     * Method to perform BubbleSort given integer array
     * @param _data
     * @return array sorted in increasing order
     */
    public int[] sort(int[] _data) {
        if(_data == null || _data.length <= 0) {
            return null;
        } else if(_data.length == 1) {
            return _data;
        } else {
            // Outer Loop goes from 1 to (n-1)
            for(int i = 1; i < _data.length-1; i++) {
                boolean flag = false;
                // Inner Loop goes from 0 to n-i-1
                for(int j = 0; j < _data.length-i-1; j++) {
                    // Swap if the current element is greater than next element
                    if(_data[j] > _data[j+1]) {
                        int temp = _data[j];
                        _data[j] = _data[j+1];
                        _data[j+1] = temp;
                        flag = true;
                    }
                }
                if(!flag) {
                    break;
                }
            }
            return _data;
        }
    }
}
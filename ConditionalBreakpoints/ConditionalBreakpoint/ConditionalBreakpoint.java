package ConditionalBreakpoint;


public class ConditionalBreakpoint {

    /**
     * Returns a new array with the absolute value of each
     * element in the input array
     *
     * @param arr input array of integers
     * @return new array of integers with absolute values
     */
    public static int[] absValueArray(int[] arr) {
        int[] result = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int abs = Utils.absValue(arr[i]);
            result[i] = abs;
        }
        return result;
    }

    /** CHALLENGE
     * Creates a new array with the sum of elements at the same distance
     * from the front and back of the array (e.g first element + last element)
     * The middle element does not get added to anything. For example,
     * [3, 4, 5] gives [3+5, 4] and [3, 4, 5, 6] gives [3+6, 4+5]
     *
     * @param arr input array of integers
     * @return new array of integers with sums
     */
    public static int[] mystery(int[] arr) {
        int mid = arr.length / 2;
        int[] res = new int[mid + 1];
        for (int i = 0; i <= mid; i++) {
            res[i] = arr[i] + arr[arr.length - i - 1];
        }
        return res;
    }
}
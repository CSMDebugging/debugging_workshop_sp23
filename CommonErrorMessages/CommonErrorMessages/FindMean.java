package CommonErrorMessages;

/**
 Given an array of integers arr, return the mean value of the array.

 If the array has no values in it, return 0.
 */
public class FindMean {

    public int findMean(int[] arr) {
        int n = arr.length;
        int sum = 0;
        if (n == 0) return sum/n;
        for (int i = 0; i <= n; i++) {
            sum = sum + arr[i];
        }
        return sum/n;

    }

}


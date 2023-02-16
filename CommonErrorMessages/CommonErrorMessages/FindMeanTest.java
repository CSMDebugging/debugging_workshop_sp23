package CommonErrorMessages;

import CommonErrorMessages.FindMean;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindMeanTest {
    // Instantiate class and input
    FindMean fm = new FindMean();
    int[] arr;

    @Test
    public void TestThree() {
        arr = new int[] {1, 2, 3};
        assertEquals(2, fm.findMean(arr));
    }

    @Test
    public void TestZero() {
        arr = new int[] {};
        assertEquals(0, fm.findMean(arr));
    }


}

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MeanMedianTest {

    @Test
    void meanTestOdd() {
        MeanMedian mm = new MeanMedian();
        int[] ref = new int[]{1,2,3,4,5};
        double ave = 3.0;
        assertEquals(ave, mm.mean(ref));
    }

    @Test
    void meanTestEven() {
        MeanMedian mm = new MeanMedian();
        int[] ref = new int[]{1,2,3,4,5,6};
        double ave = 3.5;
        assertEquals(ave, mm.mean(ref));
    }

    @Test
    void medianTestOdd() {
        MeanMedian mm = new MeanMedian();
        int[] ref = new int[]{1,5,10,15,20};
        double med = 10.0;
        assertEquals(med, mm.median(ref));
    }

    @Test
    void medianTestEven() {
        MeanMedian mm = new MeanMedian();
        int[] ref = new int[]{1,5,10,15,20,25};
        double med = 12.5;
        assertEquals(med, mm.median(ref));
    }
}

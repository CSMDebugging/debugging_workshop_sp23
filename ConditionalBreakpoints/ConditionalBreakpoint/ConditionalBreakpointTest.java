package ConditionalBreakpoint;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;


public class ConditionalBreakpointTest {
    public static void main(String[] args) {
        absValTest1();
        absValTest2();
//        mysteryTest1();
//        mysteryTest2();
    }

    @Test
    public static void absValTest1() {
        int[] testArr = {-5, 3, 6, 12, -823, -9823};
        int[] expected = {5, 3, 6, 12, 823, 9823};
        int[] actual = ConditionalBreakpoint.absValueArray(testArr);
        assertArrayEquals(
                "Expected " + Arrays.toString(expected) + " but got " + Arrays.toString(actual),
                expected,
                actual);
    }

    @Test
    public static void absValTest2() {
        int[] testArr = {-5, 3, 6, 12, -823, -9823, 1};
        int[] expected = {5, 3, 6, 12, 823, 9823, 1};
        int[] actual = ConditionalBreakpoint.absValueArray(testArr);
        assertArrayEquals(
                "Expected " + Arrays.toString(expected) + " but got " + Arrays.toString(actual),
                expected,
                actual);
    }

    @Test
    public static void mysteryTest1(){
        int[] testArr = {1, 2, 3, 4, 5, 6};
        int[] expected = {7, 7, 7};
        int[] actual = ConditionalBreakpoint.mystery(testArr);
        assertArrayEquals(
                "Expected " + Arrays.toString(expected) + " but got " + Arrays.toString(actual),
                expected,
                actual);
    }

    @Test
    public static void mysteryTest2(){
        int[] testArr = {1, 2, 3, 4, 5, 6, 7};
        int[] expected = {8, 8, 8, 4};
        int[] actual = ConditionalBreakpoint.mystery(testArr);
        assertArrayEquals(
                "Expected " + Arrays.toString(expected) + " but got " + Arrays.toString(actual),
                expected,
                actual);
    }
}
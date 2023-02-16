package Visualizer;
import java.lang.Math;
import java.lang.System;
import org.junit.Test;
import java.util.Arrays;
import static org.junit.Assert.*;

public class Solution {

    public static void testAll() {
        test1();
        test2();
        test3();
    }

    public static void test1() {
        int[] arr1 = {1};
        int[] arr2 = {0};
        int[] expected = {0};
        mergeArr(arr1, 0, arr2, 1);
        assertArrayEquals("Expected: " + Arrays.toString(expected) + " | Received: " + Arrays.toString(actual),
                expected, arr1);
    }

    public static void test2() {
        int[] arr1 = {1,3,8,0,0,0};
        int[] arr2 = {4,5,7};
        int[] expected = {1,3,4,5,7,8};
        mergeArr(arr1, 3, arr2, 3);
        assertArrayEquals("Expected: " + Arrays.toString(expected) + " | Received: " + Arrays.toString(arr1),
                expected, arr1);
    }

    public static void test3() {
        int[] arr1;
        int[] arr2;
        int[] expected;
        for (int round = 0; round < 50; round++) {
            int m = (int)(Math.random() * 20), n = (int)(Math.random() * 20);
            arr1 = new int[m];
            arr2 = new int[n];
            fillRandomArray(arr1);
            fillRandomArray(arr2);
            Visualizer.mergeArr(arr1, m, arr2, n);
            expected = mergeBruteForce(arr1, m, arr2);
            assertArrayEquals("Expected: " + Arrays.toString(expected) + " | Received: " + Arrays.toString(arr1),
                    expected, arr1);
        }
    }

    public static int[] mergeBruteForce(int[] arr1, int m, int[] arr2) {
        int[] expected = new int[m + arr2.length];
        System.arraycopy(arr1, 0, expected, 0, m);
        System.arraycopy(arr2, 0, expected, m, arr2.length);
        Arrays.sort(expected);
        return expected;
    }

    public static void fillRandomArray(int[] target) {
        for (int i = 0; i < target.length; i++)
            target[i] = Math.random() * 25;
    }

    public static void main(String[] args) {
        testAll();
    }
}
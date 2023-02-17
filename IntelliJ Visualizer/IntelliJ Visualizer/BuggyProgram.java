package BugVisualizer;

import java.util.ArrayList;

public class BuggyProgram {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(4);
        numbers.add(7);
        numbers.add(789);
        System.out.println("Sum of odd numbers: " + sumOddNumbers(numbers));
    }

    /**
     * Given an ArrayList of integers, return the sum of all odd integers in the array.
     */
    public static int sumOddNumbers(ArrayList<Integer> numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            int num = numbers.get(i);
            if (num % 2 == 0) {
                numbers.remove(i);
            } else {
                sum += num;
            }
        }
        return sum;
    }
}
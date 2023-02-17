package BugVisualizer;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;


public class BuggyProgramTest {
    @Test
    public void testOddInput() {
        BuggyProgram buggyProgram = new BuggyProgram();
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(5);
        numbers.add(7);
        numbers.add(9);
        int expectedSum = 25; // Sum of odd numbers
        int actualSum = buggyProgram.sumOddNumbers(numbers);
        assertEquals(expectedSum, actualSum);
    }

    @Test
    public void testEvenInput() {
        BuggyProgram buggyProgram = new BuggyProgram();
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(8);
        numbers.add(4);
        numbers.add(10);
        numbers.add(788);
        int expectedSum = 0; // Sum of odd numbers
        int actualSum = buggyProgram.sumOddNumbers(numbers);
        assertEquals(expectedSum, actualSum);
    }

    @Test
    public void testMixedInput() {
        BuggyProgram buggyProgram = new BuggyProgram();
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(6);
        numbers.add(7);
        numbers.add(9);
        int expectedSum = 20; // Sum of odd numbers
        int actualSum = buggyProgram.sumOddNumbers(numbers);
        assertEquals(expectedSum, actualSum);
    }

}
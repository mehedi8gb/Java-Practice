package testing;
import org.junit.Test;

import logic.Maths;

import static org.junit.Assert.*;

import java.util.ArrayList;

public class TestMyApp {
    
    @Test
    public void testGetSummation() {
        // Test case 1
        assertEquals(15, Maths.getSummation(5).intValue());

        // Test case 2
        assertEquals(55, Maths.getSummation(10).intValue());

        // Test case 3
        assertEquals(5050, Maths.getSummation(100).intValue());
    }

    @Test
    public void testIsEven() {
        // Test case 1
        assertTrue(Maths.isEven(4));

        // Test case 2
        assertFalse(Maths.isEven(7));
    }

    @Test
    public void testIsDivisible() {
        // Test case 1
        assertTrue(Maths.isDivisible(10, 2));

        // Test case 2
        assertFalse(Maths.isDivisible(7, 3));
    }

    @Test
    public void testIsPrime() {
        // Test case 1
        assertTrue(Maths.isPrime(2));

        // Test case 2
        assertTrue(Maths.isPrime(17));

        // Test case 3
        assertFalse(Maths.isPrime(10));
    }

    @Test
    public void factorize() {


// Test case 1: Number with only one factor
    ArrayList<Integer> expected1 = new ArrayList<>();
    expected1.add(19);
    assertEquals(expected1, Maths.factorize(19));

    // Test case 2: Number with multiple factors
    ArrayList<Integer> expected2 = new ArrayList<>();
    expected2.add(2);
    expected2.add(2);
    expected2.add(2);
    expected2.add(3);
    assertEquals(expected2, Maths.factorize(24));

    // Test case 3: Number with repeated factors
    ArrayList<Integer> expected3 = new ArrayList<>();
    expected3.add(2);
    expected3.add(2);
    expected3.add(3);
    expected3.add(3);
    expected3.add(5);
    assertEquals(expected3, Maths.factorize(180));

    // Test case 4: Number with prime factors
    ArrayList<Integer> expected4 = new ArrayList<>();
    expected4.add(2);
    expected4.add(3);
    expected4.add(5);
    expected4.add(7);
    assertEquals(expected4, Maths.factorize(210));

    // Test case 5: Number with factors including large prime
    ArrayList<Integer> expected5 = new ArrayList<>();
    expected5.add(2);
    expected5.add(2);
    expected5.add(3);
    expected5.add(3);
    expected5.add(5);
    expected5.add(7);
    expected5.add(11);
    assertEquals(expected5, Maths.factorize(13860));

        // Test case for 5000
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(2);
        expected.add(2);
        expected.add(2);
        expected.add(5);
        expected.add(5);
        expected.add(5);
        expected.add(5);
        assertEquals(expected, Maths.factorize(5000));
    }
    
    


}

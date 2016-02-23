package dugan.joseph.exceptions;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by joseph on 2/20/16.
 */
public class CalculatorTest {
    Calculator calc;
    int testInt1;
    int testInt2;

    @Before
    public void setUp() {
        calc = new Calculator();

        testInt1 = 1;
        testInt2 = 2;
    }

    @Test
    public void testAdd() {
        //when
        int actualForCorrectAddition = Calculator.add(testInt1, testInt2);
        int expectedForCorrectAddition = testInt1 + testInt2;

        //then

        assertEquals("Incorrect addition", expectedForCorrectAddition, actualForCorrectAddition);

        assertFalse("Addition violated", actualForCorrectAddition != expectedForCorrectAddition);

    }

    @Test
    public void testSubstract() {
        // when
        int actualForCorrectSubtraction = Calculator.subtract(testInt1, testInt2);
        int expectedForCorrectSubtraction = testInt1 - testInt2;

        // then
        assertEquals("incorrect subtaction", expectedForCorrectSubtraction, actualForCorrectSubtraction);
        assertFalse("Subtraction violated", expectedForCorrectSubtraction != actualForCorrectSubtraction);
    }

    @Test
    public void testMultiply() {
        // when
        int actualForCorrectMultiplication = Calculator.multiply(testInt1, testInt2);
        int expectedForCorrectMultiplication = testInt1 * testInt2;

        // then
        assertEquals("Incorrect multiplication", expectedForCorrectMultiplication, actualForCorrectMultiplication);
        assertFalse("Multiplication violated", expectedForCorrectMultiplication != actualForCorrectMultiplication);
    }

    @Test
    public void testDivide() {
        // when
        int actualForCorrectDivision = Calculator.divide(testInt2, testInt1);
        int expectedForCorrectDivision = testInt2 / testInt1;

        // then
        assertEquals("Incorrect diision", expectedForCorrectDivision, actualForCorrectDivision);
        assertFalse("Division violated", expectedForCorrectDivision != actualForCorrectDivision);
    }

    @Test(expected = DivisionByZeroException.class)
    public void testDivisionByZero() {
        Calculator.divide(testInt2,  0);
    }

    @After
    public void teardown() {
        calc = null;
    }

}

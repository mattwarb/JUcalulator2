package claculator2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestNegative {
    calculator calculator;
    @Before
    public void makeCalculator(){
        calculator = new calculator();
    }
    @Test
    public void testNegAdd(){
        assertEquals(calculator.addition(-2, -2), -4);
    }
    @Test
    public void testNegSub(){
        assertEquals(calculator.subtraction(-2, -2), 0);

    }
    @Test
    public void testNegMultiply(){
        assertEquals(calculator.multiply(-2, -2), 4);
    }

}

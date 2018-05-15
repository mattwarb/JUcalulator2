package claculator2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestDivide {
    calculator calculator;

    @Before
    public void makeCalculator(){
        calculator = new calculator();
    }

    @Test
    public void testDivide(){
        assertEquals(calculator.divide(20, 4), 5);
    }

}

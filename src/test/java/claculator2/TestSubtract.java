package claculator2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestSubtract {
    calculator calculator;

    @Before
    public void makeCalulator(){
        calculator = new calculator();
    }
    @Test
    public void testSubtract(){
        assertEquals(calculator.subtraction(5, 3), 2);
    }
}

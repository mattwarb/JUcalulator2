package claculator2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestMultiply {
    calculator calculator;

    @Before
    public void makeCalulator(){
        calculator = new calculator();
    }
    @Test
    public void testMultiply(){
        assertEquals(calculator.multiply(0,5),0);
    }

}

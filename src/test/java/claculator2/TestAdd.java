package claculator2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestAdd {
    calculator calculator;

    @Before
    public void makeCalulator(){
        calculator = new calculator();
    }
    @Test
    public void testAdd(){
        assertEquals(calculator.addition(2,3), 5);
    }
}

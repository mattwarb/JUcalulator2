package claculator2;

import org.junit.Before;
import org.junit.Test;



import static org.junit.Assert.*;

public class calculatorTest {

    calculator calculator;
    @Before
    public void makeCalculator(){
        calculator = new calculator();
    }
    @Test
    public void testCalculatorExists(){

        assertNotNull(calculator);
    }







}

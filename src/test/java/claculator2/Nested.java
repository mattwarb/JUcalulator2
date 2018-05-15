package claculator2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Nested {
    calculator calc;
    @Before
    public void create(){
        calc = new calculator();
    }
    @Test
    public void nestedMathsTest(){
        assertEquals(calc.multiply(calc.addition(1,1),2),4);
    }
}

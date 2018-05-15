package claculator2;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;



import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class testParam {
    calculator calculator;
    private int intPut;
    private int intExp;
    @Before
    public void makeCalculator(){
        calculator = new calculator();
    }
    @Parameterized.Parameters
    public static Collection<Object[]> data(){
    return Arrays.asList(new Object[][]{{0,0}, {1,2},{2,4},{3,6}});
    }
    public testParam(int input, int output){
        intPut = input;
        intExp = output;
    }

    @Test
    public void testArray(){
        assertEquals(intExp, calculator.addition( intPut, intPut));
    }
}

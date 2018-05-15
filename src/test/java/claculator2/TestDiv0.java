package claculator2;

import org.junit.Before;
import org.junit.Test;

public class TestDiv0 {
    calculator calculator;
    @Before
    public void makeCalculator(){
        calculator = new calculator();
    }
    @Test
    public void testDiv0(){
        try{
            calculator.divide(9,0);

        }
        catch(ArithmeticException e){
            e.printStackTrace();

        }
    }



}

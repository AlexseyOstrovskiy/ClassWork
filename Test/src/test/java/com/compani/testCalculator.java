package com.compani;

import org.junit.Assert;
import org.junit.Test;

public class testCalculator {
    @Test
    public void sumTest(){
    Calculator calculator = new Calculator();
    int result = calculator.sum(2,2);
        Assert.assertEquals(result, 4);

    }

    @Test
    public void diffTest(){
        Calculator calculator = new Calculator();
        int result = calculator.diff(5,2);
        Assert.assertEquals(result, 3);
    }

    @Test()
    public void divTest() throws MyException {
        Calculator calculator = new Calculator();
        int result = calculator.div(4,2);
        Assert.assertEquals(result, 2);

    }

    @Test(expected = MyException.class )
    public void divOnZeroTest() throws MyException {
        Calculator calculator = new Calculator();
        int result = calculator.div(4,0);

    }

}

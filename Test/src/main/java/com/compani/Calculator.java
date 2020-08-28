package com.compani;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Calculator {
    private static Logger logger = LoggerFactory.getLogger(Calculator.class);

    public int sum(int i, int i1) {
        logger.error("first "+i+" second "+ i1);
        int sumResult = i + i1;
        return sumResult;

    }

    public int diff(int i, int i1) {
        int diffResult = i - i1;
        return diffResult;
    }


    public int div(int i, int i1) throws MyException {
        if(i1==0 ){
       throw new MyException();
        }
        else{
            int divResult = i -i1;
            return divResult;
        }
    }
}

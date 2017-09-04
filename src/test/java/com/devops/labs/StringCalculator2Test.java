package com.devops.labs;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by praka on 9/2/2017.
 */

public class StringCalculator2Test {


    @Test
    public void testCalculateForEmptyInput() {
        StringCalculator stringCalculator = new StringCalculator();
        String input = "";
        int result = stringCalculator.calculate(input);
        assertEquals(0,result);
    }



}


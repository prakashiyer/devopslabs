package com.devops.labs;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by praka on 9/2/2017.
 */

public class StringCalculator4Test {


    @Test
    public void testCalculateFor3Numbers() {
        StringCalculator stringCalculator = new StringCalculator();
        String input = "2\n4\n6";
        int result = stringCalculator.calculate(input);
        assertEquals(12, result);
    }

    @Test
    public void testCalculateFor5Number() {
        StringCalculator stringCalculator = new StringCalculator();
        String input = "4\n4\n5\n6\n5";
        int result = stringCalculator.calculate(input);
        assertEquals(24, result);
    }



}


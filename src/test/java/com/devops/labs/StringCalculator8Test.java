package com.devops.labs;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by praka on 9/2/2017.
 */

public class StringCalculator8Test {


    @Test
    public void testCalculateForNumbersGreaterThan1kInput() {
        StringCalculator stringCalculator = new StringCalculator();
        String input = "2\n4\n1001";
        int result = stringCalculator.calculate(input);
        assertEquals(6, result);
    }


    @Test
    public void testCalculateForCommaCorrectInput() {
        StringCalculator stringCalculator = new StringCalculator();
        String input = "2,6";
        int result = stringCalculator.calculate(input);
        assertEquals(8, result);
    }

    @Test
    public void testCalculateForMixedCorrectGreaterThan1kInput() {
        StringCalculator stringCalculator = new StringCalculator();
        String input = "2,6000\n4";
        int result = stringCalculator.calculate(input);
        assertEquals(6, result);
    }



}


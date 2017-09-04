package com.devops.labs;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by praka on 9/2/2017.
 */

public class StringCalculator1Test {


    @Test
    public void testCalculateForCorrectInput() {
        StringCalculator stringCalculator = new StringCalculator();
        String input = "2\n4";
        stringCalculator.calculate(input);
        assertTrue(true);
    }


    @Test
    public void testCalculateForMoreThanTwoNumbers() {
        StringCalculator stringCalculator = new StringCalculator();
        String input = "2\n6\n8";
        stringCalculator.calculate(input);
        assertTrue(true);
    }

    @Test(expected = RuntimeException.class)
    public void testCalculateForWrongDelimiterInput() {
        StringCalculator stringCalculator = new StringCalculator();
        String input = "2:6";
        stringCalculator.calculate(input);
    }

    @Test(expected = RuntimeException.class)
    public void testCalculateForNonNumericInput() {
        StringCalculator stringCalculator = new StringCalculator();
        String input = "ab\nbc";
        stringCalculator.calculate(input);
    }



}


package com.devops.labs;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by praka on 9/2/2017.
 */

public class StringCalculatorTest {


    @Test
    public void testCalculateForCorrectInput() {
        StringCalculator stringCalculator = new StringCalculator();
        String input = "2,4";
        stringCalculator.calculate(input);
        assertTrue(true);
    }

    @Test
    public void testCalculateForEmptyInput() {
        StringCalculator stringCalculator = new StringCalculator();
        String input = "";
        stringCalculator.calculate(input);
        assertTrue(true);
    }

    @Test(expected = RuntimeException.class)
    public void testCalculateForMoreThanTwoNumbers() {
        StringCalculator stringCalculator = new StringCalculator();
        String input = "2,6,8";
        stringCalculator.calculate(input);
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
        String input = "ab,bc";
        stringCalculator.calculate(input);
    }



}


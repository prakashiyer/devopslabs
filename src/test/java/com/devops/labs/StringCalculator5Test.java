package com.devops.labs;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by praka on 9/2/2017.
 */

public class StringCalculator5Test {


    @Test
    public void testCalculateForCorrectInput() {
        StringCalculator stringCalculator = new StringCalculator();
        String input = "2\n4";
        stringCalculator.calculate(input);
        assertTrue(true);
    }


    @Test
    public void testCalculateForWrongDelimiterInput() {
        StringCalculator stringCalculator = new StringCalculator();
        String input = "2,6";
        stringCalculator.calculate(input);
        assertTrue(true);
    }



}


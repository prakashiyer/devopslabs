package com.devops.labs;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by praka on 9/2/2017.
 */

public class StringCalculator7Test {


    @Test
    public void testCalculateForSlashNCorrectInput() {
        StringCalculator stringCalculator = new StringCalculator();
        String input = "2\n4";
        int result = stringCalculator.calculate(input);
        assertEquals(6, result);
    }

    @Test(expected = RuntimeException.class)
    public void testCalculateForSlashNNegativeInput() {
        StringCalculator stringCalculator = new StringCalculator();
        String input = "-2\n4";
        stringCalculator.calculate(input);
    }


    @Test
    public void testCalculateForCommaCorrectInput() {
        StringCalculator stringCalculator = new StringCalculator();
        String input = "2,6";
        int result = stringCalculator.calculate(input);
        assertEquals(8, result);
    }

    @Test(expected = RuntimeException.class)
    public void testCalculateForCommaNegativeInput() {
        StringCalculator stringCalculator = new StringCalculator();
        String input = "2,-6";
        stringCalculator.calculate(input);
    }

    @Test
    public void testCalculateForMixedCorrectInput() {
        StringCalculator stringCalculator = new StringCalculator();
        String input = "2,6\n4";
        int result = stringCalculator.calculate(input);
        assertEquals(12, result);
    }

    @Test(expected = RuntimeException.class)
    public void testCalculateForMixedNegativeInput() {
        StringCalculator stringCalculator = new StringCalculator();
        String input = "2,-6\n4";
       stringCalculator.calculate(input);

    }



}


package com.devops.labs;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by praka on 9/2/2017.
 */

public class StringCalculator6Test {


    @Test
    public void testCalculateForSlashNCorrectInput() {
        StringCalculator stringCalculator = new StringCalculator();
        String input = "2\n4";
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
    public void testCalculateForMixedCorrectInput() {
        StringCalculator stringCalculator = new StringCalculator();
        String input = "2,6\n4";
        int result = stringCalculator.calculate(input);
        assertEquals(12, result);
    }



}


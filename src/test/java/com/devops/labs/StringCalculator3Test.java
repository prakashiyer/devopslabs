package com.devops.labs;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by praka on 9/2/2017.
 */

public class StringCalculator3Test {


    @Test
    public void testCalculateFor2Numbers() {
        StringCalculator stringCalculator = new StringCalculator();
        String input = "2\n4";
        int result = stringCalculator.calculate(input);
        assertEquals(6, result);
    }

    @Test
    public void testCalculateFor1Number() {
        StringCalculator stringCalculator = new StringCalculator();
        String input = "4";
        int result = stringCalculator.calculate(input);
        assertEquals(4, result);
    }



}


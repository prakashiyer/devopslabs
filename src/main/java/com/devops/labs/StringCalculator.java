package com.devops.labs;

/**
 * Created by praka on 9/2/2017.
 */
public class StringCalculator {

    public int calculate(String input) {

        int result = 0;
        if(input != null && !input.isEmpty()) {
            String[] inputArray = input.split(",|\n");

            /*if(inputArray.length == 0 || inputArray.length > 2) {
                throw new RuntimeException("Incorrect input parameters");
            } else {
                for(String nextNumber: inputArray) {
                    if(!nextNumber.isEmpty()) {
                        result = result + Integer.valueOf(nextNumber);
                    }

                }
            }*/
            for(String nextNumber: inputArray) {
                if(!nextNumber.isEmpty()) {
                    int numberToAdd = Integer.valueOf(nextNumber);
                    if(numberToAdd < 0) {
                        throw new RuntimeException("Negative number is not allowed");
                    }
                    if(numberToAdd <= 1000) {
                        result = result + Integer.valueOf(nextNumber);
                    }

                }

            }
        }

        return result;

    }

}

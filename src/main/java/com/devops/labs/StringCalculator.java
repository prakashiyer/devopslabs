package com.devops.labs;

/**
 * Created by praka on 9/2/2017.
 */
public class StringCalculator {

    public void calculate(String input) {

        int result = 0;
        if(input != null) {
            String[] inputArray = input.split(",");

            if(inputArray.length == 0 || inputArray.length > 2) {
                throw new RuntimeException("Incorrect input parameters");
            } else {
                for(String nextNumber: inputArray) {
                    if(!nextNumber.equals("")) {
                        Integer.parseInt(nextNumber);
                    }

                }
            }
        }




    }

}

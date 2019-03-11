package rocks.zipcode.io.quiz3.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author leon on 09/12/2018.
 */
public class SquareArrayAnalyzer {
    public static Boolean compare(Integer[] input, Integer[] squaredValues) {

        Integer[] arr1 = new Integer[input.length];

        for (int i = 0; i < input.length; i++) {

            if (squaredValues[i] == input[i] * input[i]) {
            }
            return true;
        }
            return false;
        }
    }

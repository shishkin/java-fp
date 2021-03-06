package org.shishkin.fp;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class B_Decomplect {

    public static
    List<Integer> iterate(int max) {
        var result = new ArrayList<Integer>();

        for (int x = 1; x <= max; x++) {
            result.add(x);
        }

        return result;
    }

    public static
    List<Integer> filterEven(List<Integer> xs) {
        var result = new ArrayList<Integer>();

        for (Integer x : xs) {
            if (x % 2 == 0) {
                result.add(x);
            }
        }

        return result;
    }

    public static
    List<Integer> square(List<Integer> xs) {
        var result = new ArrayList<Integer>();

        for (Integer x : xs) {
            result.add(x * x);
        }

        return result;
    }

    public static
    int sum(List<Integer> xs) {
        var result = 0;

        for (Integer x : xs) {
            result += x;
        }

        return result;
    }

    public static
    int sumOfSquaresOfEvenNumbersUpTo(int max) {
        return sum(square(filterEven(iterate(max))));
    }

    @Test
    public void test() {
        assertEquals(220, sumOfSquaresOfEvenNumbersUpTo(10));
    }
}

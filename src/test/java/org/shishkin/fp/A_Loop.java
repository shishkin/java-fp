package org.shishkin.fp;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class A_Loop {

    public static int sumOfSquaresOfEvenNumbersUpTo(int max) {
        int sum = 0;

        for (int x = 1; x <= max; x++) {
            if (x % 2 == 0)
                sum += x * x;
        }

        return sum;
    }

    @Test
    public void test() {
        assertEquals(220, sumOfSquaresOfEvenNumbersUpTo(10));
    }
}

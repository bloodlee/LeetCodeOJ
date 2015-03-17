package org.yli.leetcode;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by yli on 3/15/2015.
 */
public class FactorialTrailingZeroesTest {

    private FactorialTrailingZeroes utilities = new FactorialTrailingZeroes();

    @Test
    public void testSimple() {
        assertEquals(0, utilities.trailingZeroes(1));
        assertEquals(1, utilities.trailingZeroes(5));
        assertEquals(6, utilities.trailingZeroes(25));
    }
}

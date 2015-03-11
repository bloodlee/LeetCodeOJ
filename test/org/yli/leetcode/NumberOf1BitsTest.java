package org.yli.leetcode;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by yli on 3/10/15.
 */
public class NumberOf1BitsTest {

    private NumberOf1Bits utilities = new NumberOf1Bits();

    @Test
    public void testNormalNumber() {
        assertEquals(4, utilities.hammingWeight(0xF));
        assertEquals(4, utilities.hammingWeight(0x00F0));
        assertEquals(4, utilities.hammingWeight(0x0F00));
        assertEquals(4, utilities.hammingWeight(0xF000));
        assertEquals(2, utilities.hammingWeight(0x0003));
        assertEquals(1, utilities.hammingWeight(0x0004));
        assertEquals(32, utilities.hammingWeight(-1));
    }

    @Test
    public void testZero() {
        assertEquals(0, utilities.hammingWeight(0));
    }

}

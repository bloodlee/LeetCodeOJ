package org.yli.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by jali on 7/28/2015.
 */
public class NumberOfDigitOneTest {

    private NumberOfDigitOne util = new NumberOfDigitOne();

    @Test
    public void testSimple() {
        assertEquals(6, util.countDigitOne(13));
    }

}

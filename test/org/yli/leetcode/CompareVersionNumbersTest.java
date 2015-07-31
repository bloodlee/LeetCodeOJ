package org.yli.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by jali on 7/30/2015.
 */
public class CompareVersionNumbersTest {
    CompareVersionNumbers util = new CompareVersionNumbers();

    @Test
    public void testSimple() {
        assertEquals(0, util.compareVersion("1.1.1.1.1", "1.1.1.1.1"));
        assertEquals(-1, util.compareVersion("0.1", "1.1"));
        assertEquals(1, util.compareVersion("1.2", "1.1"));
        assertEquals(-1, util.compareVersion("1", "1.1"));
        assertEquals(0, util.compareVersion("1.0", "1"));
    }

}

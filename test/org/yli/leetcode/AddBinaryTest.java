package org.yli.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by jali on 7/20/2015.
 */
public class AddBinaryTest {
    private AddBinary util = new AddBinary();

    @Test
    public void testSimple() {
        assertEquals("100", util.addBinary("11", "1"));
        assertEquals("100", util.addBinary("1", "11"));
        assertEquals("1001", util.addBinary("1000", "1"));
        assertEquals("10000", util.addBinary("1000", "1000"));
        assertEquals("11110", util.addBinary("1111", "1111"));
    }
}

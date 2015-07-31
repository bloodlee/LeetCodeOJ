package org.yli.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

/**
 * Created by jali on 7/30/2015.
 */
public class ExcelSheetColumnTitleTest {

    ExcelSheetColumnTitle util = new ExcelSheetColumnTitle();

    @Test
    public void testSimple() {
        assertEquals("A", util.convertToTitle(1));
        assertEquals("C", util.convertToTitle(3));
        assertEquals("Z", util.convertToTitle(26));
        assertEquals("AB", util.convertToTitle(28));
        assertEquals("BB", util.convertToTitle(54));
    }
}

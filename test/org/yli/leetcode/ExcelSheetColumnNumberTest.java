package org.yli.leetcode;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by yli on 3/17/2015.
 */
public class ExcelSheetColumnNumberTest {

    private ExcelSheetColumnNumber utilties = new ExcelSheetColumnNumber();

    @Test
    public void testSimple() {
        assertEquals(1, utilties.titleToNumber("A"));
        assertEquals(26, utilties.titleToNumber("Z"));
        assertEquals(27, utilties.titleToNumber("AA"));
    }

}

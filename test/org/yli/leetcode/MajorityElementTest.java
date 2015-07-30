package org.yli.leetcode;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by yli on 3/18/2015.
 */
public class MajorityElementTest {

    private MajorityElement utilities = new MajorityElement();

    @Test
    public void testSimple1() {
        assertEquals(1, utilities.majorityElement(new int[] {1, 1}));
        assertEquals(2, utilities.majorityElement(new int[] {1, 2, 2}));
    }

    @Test
    public void testSimple2() {
        assertEquals(1, utilities.majorityElement2(new int[] {1, 1}));
        assertEquals(2, utilities.majorityElement2(new int[] {1, 2, 2}));
    }

}

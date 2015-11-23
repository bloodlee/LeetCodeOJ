package org.yli.leetcode;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by yli on 11/7/2015.
 */
public class FindMinimumInRotatedSortedArrayTest {

    FindMinimumInRotatedSortedArray util = new FindMinimumInRotatedSortedArray();

    @Test
    public void testSimple() {
        assertEquals(1, util.findMin(new int[] {4, 5, 6, 1, 2, 3}));
        assertEquals(1, util.findMin(new int[] {3, 2, 1, 6, 5, 4}));
        assertEquals(1, util.findMin(new int[] {3, 2, 1}));
        assertEquals(1, util.findMin(new int[] {3, 2}));
        assertEquals(1, util.findMin(new int[] {5, 1, 2, 3, 4}));
    }

}

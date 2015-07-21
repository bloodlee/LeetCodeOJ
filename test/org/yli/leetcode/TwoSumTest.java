package org.yli.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by jali on 7/20/2015.
 */
public class TwoSumTest {

    TwoSum util = new TwoSum();

    @Test
    public void testSimple() {
        int[] nums = new int[] {2, 7, 11, 15};
        assertArrayEquals(new int[] {1, 2}, util.twoSum(nums, 9));
        assertArrayEquals(new int[] {1, 3}, util.twoSum(nums, 13));
        assertArrayEquals(new int[] {1, 4}, util.twoSum(nums, 17));
    }

}

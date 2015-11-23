package org.yli.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by yli on 11/8/2015.
 */
public class MoveZerosTest {

    MoveZeros util = new MoveZeros();

    @Test
    public void testSimple() {
        int[] nums = new int[] {0, 1, 0, 3, 12};
        util.moveZeroes(nums);
        assertArrayEquals(new int[] {1, 3, 12, 0, 0}, nums);

        nums = new int[] {1, 1, 0, 3, 12};
        util.moveZeroes(nums);
        assertArrayEquals(new int[] {1, 1, 3, 12, 0}, nums);
    }

}

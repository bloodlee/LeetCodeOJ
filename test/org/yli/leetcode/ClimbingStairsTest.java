package org.yli.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by jali on 7/24/2015.
 */
public class ClimbingStairsTest {

    ClimbingStairs util = new ClimbingStairs();

    @Test
    public void testSimple() {
        assertEquals(0, util.climbStairs(0));
        assertEquals(1, util.climbStairs(1));
        assertEquals(2, util.climbStairs(2));
        assertEquals(3, util.climbStairs(3));
    }
}

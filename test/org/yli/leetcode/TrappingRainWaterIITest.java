package org.yli.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrappingRainWaterIITest {
  TrappingRainWaterII util = new TrappingRainWaterII();

  @Test
  public void testSimple() {
    assertEquals(4, util.trapRainWater(new int[][] {
        {1, 4, 3, 1, 3, 2},
        {3, 2, 1, 3, 2, 4},
        {2, 3, 3, 2, 3, 1},
    }));

    assertEquals(0, util.trapRainWater(new int[][] {
        {3, 3, 3, 3, 3, 3},
        {3, 3, 3, 3, 3, 3},
        {3, 3, 3, 3, 3, 3},
    }));

    assertEquals(8, util.trapRainWater(new int[][] {
        {3, 3, 3, 3, 3, 3},
        {3, 1, 1, 1, 1, 3},
        {3, 3, 3, 3, 3, 3},
    }));

    assertEquals(0, util.trapRainWater(new int[][] {
        {3, 1, 3, 3, 3, 3},
        {3, 1, 1, 1, 1, 3},
        {3, 3, 3, 3, 3, 3},
    }));

    assertEquals(14, util.trapRainWater(new int[][] {
        {12,13,1,12},
        {13,4,13,12},
        {13,8,10,12},
        {12,13,12,12},
        {13,13,13,13},
    }));

  }
}

package org.yli.leetcode;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by yli on 4/28/15.
 */
public class PowerTest {

  private Power utilities = new Power();

  @Test
  public void testSimple() {
    assertEquals(4, utilities.myPow(2.0, 2), 1e-6);
    assertEquals(0.25, utilities.myPow(2.0, -2), 1e-6);
    assertEquals(1, utilities.myPow(2.0, 0), 1e-6);
  }

  @Test(timeout = 1)
  public void testPerformance() {
    utilities.myPow(0.00001, 2147483647);
  }
}

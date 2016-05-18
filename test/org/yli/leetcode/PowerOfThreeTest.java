package org.yli.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by yli on 1/9/2016.
 */
public class PowerOfThreeTest {

  private PowerOfThree util = new PowerOfThree();

  @Test
  public void testSimple() {
    assertTrue(util.isPowerOfThree(9));
    assertTrue(util.isPowerOfThree(3));
    assertFalse(util.isPowerOfThree(4));
    assertFalse(util.isPowerOfThree(0));
    assertTrue(util.isPowerOfThree(1));
  }

}

package org.yli.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by yli on 7/19/15.
 */
public class PowerOfTwoTest {

  PowerOfTwo util = new PowerOfTwo();

  @Test
  public void testSimple() {
//    assertFalse(util.isPowerOfTwo(0));
//    assertTrue(util.isPowerOfTwo(1));
//    assertTrue(util.isPowerOfTwo(2));
//    assertTrue(util.isPowerOfTwo(4));
//    assertTrue(util.isPowerOfTwo(8));
//    assertTrue(util.isPowerOfTwo(1024));
//
//    assertFalse(util.isPowerOfTwo(3));
//    assertFalse(util.isPowerOfTwo(6));
//    assertFalse(util.isPowerOfTwo(12));

    assertFalse(util.isPowerOfTwo(-2147483648));
  }

}

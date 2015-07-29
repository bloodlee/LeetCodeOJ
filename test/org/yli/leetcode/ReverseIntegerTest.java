package org.yli.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by yli on 7/28/2015.
 */
public class ReverseIntegerTest {

  ReverseInteger util = new ReverseInteger();

  @Test
  public void testSimple() {
    assertEquals(1, util.reverse(100));
    assertEquals(-1, util.reverse(-100000));
    assertEquals(-1000001, util.reverse(-1000001));
    assertEquals(321, util.reverse(123));
    assertEquals(-321, util.reverse(-123));
    assertEquals(0, util.reverse(1000000003));
    assertEquals(0, util.reverse(1534236469));
    assertEquals(0, util.reverse(0));
  }

}

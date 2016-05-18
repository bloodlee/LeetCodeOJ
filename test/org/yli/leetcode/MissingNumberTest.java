package org.yli.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by yli on 1/16/2016.
 */
public class MissingNumberTest {

  private MissingNumber util = new MissingNumber();

  @Test
  public void testSimple() {
    assertEquals(2, util.missingNumber(new int[] {0, 1, 3}));
  }

}

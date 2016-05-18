package org.yli.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by yli on 1/16/2016.
 */
public class NimGameTest {

  private NimGame util = new NimGame();

  @Test
  public void testSimple() {
    Assert.assertTrue(util.canWinNim(1));
    Assert.assertTrue(util.canWinNim(2));
    Assert.assertTrue(util.canWinNim(3));
    Assert.assertFalse(util.canWinNim(4));

    Assert.assertFalse(util.canWinNim(8));
    Assert.assertFalse(util.canWinNim(20));

    Assert.assertFalse(util.canWinNim(200));
  }

}

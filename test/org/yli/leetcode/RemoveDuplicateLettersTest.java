package org.yli.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by yli on 1/9/2016.
 */
public class RemoveDuplicateLettersTest {

  private RemoveDuplicateLetters util = new RemoveDuplicateLetters();

  @Test
  public void testSimple() {
    assertEquals("abc", util.removeDuplicateLetters("bcabc"));
    assertEquals("abc", util.removeDuplicateLetters("bccccbbbccccbbbbaaaaaabc"));
    assertEquals("acdb", util.removeDuplicateLetters("cbacdcbc"));
  }

}

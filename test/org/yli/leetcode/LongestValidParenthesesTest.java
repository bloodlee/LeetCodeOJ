package org.yli.leetcode;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by yli on 11/14/2015.
 */
public class LongestValidParenthesesTest {

  LongestValidParentheses util = new LongestValidParentheses();

  @Test
  public void testSimple() {
    assertEquals(2, util.longestValidParentheses("(()"));
    assertEquals(4, util.longestValidParentheses("(()()("));
  }

}

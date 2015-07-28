package org.yli.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by yli on 7/27/2015.
 */
public class EvaluateReversePolishNotationTest {

  private EvaluateReversePolishNotation util = new EvaluateReversePolishNotation();

  @Test
  public void testSimple() {
    assertEquals(6, util.evalRPN(new String[]{"2", "1", "+", "3", "+"}));
    assertEquals(1, util.evalRPN(new String[]{"2", "1", "-"}));
    assertEquals(8, util.evalRPN(new String[]{"2", "2", "*", "2", "*"}));
    assertEquals(8, util.evalRPN(new String[]{"2", "2", "2", "*", "*"}));
    assertEquals(-1, util.evalRPN(new String[]{"1", "2", "-"}));
    assertEquals(-1, util.evalRPN(new String[]{"1", "2", "-"}));
    assertEquals(9, util.evalRPN(new String[]{"2", "1", "+", "3", "*"}));
    assertEquals(6, util.evalRPN(new String[]{"4", "13", "5", "/", "+"}));
  }

}

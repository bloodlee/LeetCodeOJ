package org.yli.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by yli on 5/9/2016.
 */
public class ReverseVowelsOfStringTest {

  @Test
  public void testSimple() {
    ReverseVowelsOfString util = new ReverseVowelsOfString();

    assertEquals("holle", util.reverseVowels("hello"));
    assertEquals("leotcede", util.reverseVowels("leetcode"));
  }

}

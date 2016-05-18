package org.yli.leetcode;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by yli on 1/16/2016.
 */
public class WordPatternTest {

  private WordPattern util = new WordPattern();

  @Test
  public void testSimple() {
    assertTrue(util.wordPattern("abba", "dog cat cat dog"));
    assertFalse(util.wordPattern("abba", "dog cat cat fish"));
    assertFalse(util.wordPattern("aaaa", "dog cat cat dog"));
    assertFalse(util.wordPattern("abba", "dog dog dog dog"));
    assertTrue(util.wordPattern("aaaa", "dog dog dog dog"));
  }

}

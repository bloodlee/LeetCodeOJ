package org.yli.leetcode;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by yli on 7/30/2015.
 */
public class MajorityElement2Test {

  MajorityElement2 util = new MajorityElement2();

  @Test
  public void testSimple1() {
    List<Integer> results = util.majorityElement(new int[] {1, 2});
    assertEquals(2, results.size());
    assertTrue(results.contains(1));
    assertTrue(results.contains(2));
  }

  @Test
  public void testSimple2() {
    List<Integer> results = util.majorityElement(new int[] {8,9,8,9,8});
    assertEquals(2, results.size());
    assertTrue(results.contains(8));
    assertTrue(results.contains(9));
  }
}

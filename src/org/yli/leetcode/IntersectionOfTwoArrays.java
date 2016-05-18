package org.yli.leetcode;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by yli on 5/17/2016.
 */
public class IntersectionOfTwoArrays {

  public int[] intersection(int[] nums1, int[] nums2) {
    Set<Integer> set1 = new HashSet<Integer>();

    for (int i = 0; i < nums1.length; ++i) {
      set1.add(nums1[i]);
    }

    Set<Integer> set2 = new HashSet<Integer>();

    for (int i = 0; i < nums2.length; ++i) {
      set2.add(nums2[i]);
    }

    set1.retainAll(set2);

    if (set1.isEmpty()) {
      return new int[] {};
    }

    int[] results = new int[set1.size()];
    int index = 0;
    for (Integer value : set1) {
      results[index++] = value;
    }

    return results;
  }

}

package org.yli.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yli on 7/30/2015.
 */
public class MajorityElement2 {
  public List<Integer> majorityElement(int[] nums) {
    int m1 = 0, n1 = 0;
    int m2 = 0, n2 = 0;

    for (int i : nums) {
      if (m1 == i) {
        ++n1;
      } else if (m2 == i) {
        ++n2;
      } else if (n1 == 0) {
        m1 = i;
        n1 = 1;
      } else if (n2 == 0) {
        m2 = i;
        n2 = 1;
      } else {
        --n1;
        --n2;
      }
    }

    n1 = n2 = 0;
    for (int i : nums) {
      if (i == m1) {
        ++n1;
      } else if (i == m2) {
        ++n2;
      }
    }

    List<Integer> result = new ArrayList<Integer>();
    if (n1 > nums.length / 3) {
      result.add(m1);
    }

    if (n2 > nums.length / 3) {
      result.add(m2);
    }

    return result;
  }
}

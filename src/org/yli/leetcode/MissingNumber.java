package org.yli.leetcode;

import java.util.BitSet;

/**
 * Created by yli on 1/16/2016.
 */
public class MissingNumber {

  public int missingNumber(int[] nums) {
    int res = 0;

    for (int i = 0; i < nums.length; ++i) {
      res ^= (i + 1) ^ nums[i];
    }

    return res;
  }

  public int missingNumber2(int[] nums) {
    int sum = 0;
    int n = nums.length;

    for (int i = 0; i < n; ++i) {
      sum += nums[i];
    }

    return (n * (n - 1)) / 2 - sum;
  }

}

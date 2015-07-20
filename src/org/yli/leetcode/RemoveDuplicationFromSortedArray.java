package org.yli.leetcode;

/**
 * Created by yli on 7/19/15.
 */
public class RemoveDuplicationFromSortedArray {
  public int removeDuplicates(int[] nums) {
    int len = 0;

    if (nums != null && nums.length > 0) {
      int num = nums[0];
      ++len;

      for (int i = 1; i < nums.length; ++i) {
        if (nums[i] == num) {
          continue;
        }
        num = nums[i];
        nums[len] = num;
        ++len;
      }
    }

    return len;
  }
}

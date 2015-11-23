package org.yli.leetcode;

/**
 * Created by yli on 11/23/2015.
 */
public class JumpGameII {

  public int jump(int[] nums) {
    if (nums.length == 1) {
      return 0;
    }

    int step = 0;
    int left = 0;
    int right = 0;

    while (left <= right) {
      ++step;

      int tempRight = right;
      for (int i = left; i <= tempRight; ++i) {
        int newRight = i + nums[i];

        if (newRight >= nums.length - 1) {
          return step;
        }

        if (newRight > right) {
          right = newRight;
        }
      }

      left = tempRight + 1;
    }

    return 0;
  }

}

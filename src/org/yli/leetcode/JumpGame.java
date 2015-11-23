package org.yli.leetcode;

/**
 * Created by yli on 11/14/2015.
 */
public class JumpGame {
  public boolean canJump(int[] nums) {
    int reach = 1;

    for (int i = 0; i < reach && reach < nums.length; ++i) {
      reach = Math.max(reach, i + 1 + nums[i]);
    }

    return reach >= nums.length;
  }
}

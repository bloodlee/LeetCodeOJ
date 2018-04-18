package org.yli.leetcode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ContainsDuplicateII {
  public boolean containsNearbyDuplicate(int[] nums, int k) {
    Map<Integer, Integer> theMap = new HashMap<>();

    for (int i = 0; i < nums.length; ++i) {
      if (theMap.containsKey(nums[i]) && i - theMap.get(nums[i]) <= k) {
        return true;
      } else {
        theMap.put(nums[i], i);
      }
    }

    return false;
  }
}

package org.yli.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yli on 7/19/15.
 */
public class SummaryRanges {
  public List<String> summaryRanges(int[] nums) {
    List<String> results = new ArrayList<String>();

    if (nums != null && nums.length > 0) {
      int start = nums[0];
      int end = nums[0];

      for (int i = 1; i < nums.length; ++i) {
        if (nums[i] == (end + 1)) {
          end = nums[i];
          continue;
        } else {
          if (start == end) {
            results.add(Integer.toString(start));
          } else {
            results.add(start + "->" + end);
          }
          start = nums[i];
          end = nums[i];
        }
      }

      if (start == end) {
        results.add(Integer.toString(start));
      } else {
        results.add(start + "->" + end);
      }
    }

    return results;
  }
}

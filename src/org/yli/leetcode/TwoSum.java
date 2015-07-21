package org.yli.leetcode;

/**
 * Created by jali on 7/20/2015.
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int len = nums.length;

        int index1 = -1;
        int index2 = -1;

        boolean found = false;
        for (int i = 0; i < len; ++i) {
            for (int j = i + 1; j < len; ++j) {
                if (nums[i] + nums[j] == target) {
                    index1 = i + 1;
                    index2 = j + 1;
                    found = true;
                    break;
                }
            }

            if (found) {
                break;
            }
        }

        return new int[] {index1, index2};
    }
}

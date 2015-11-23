package org.yli.leetcode;

/**
 * Created by yli on 11/8/2015.
 */
public class RemoveElement {

    public int removeElement(int[] nums, int val) {
        int last = nums.length;

        int i = 0;
        while (i != last) {
            if (nums[i] == val) {
                nums[i] = nums[--last];
                continue;
            } else {
                ++i;
            }
        }

        return i;
    }
}

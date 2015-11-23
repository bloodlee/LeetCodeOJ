package org.yli.leetcode;

/**
 * Created by yli on 11/7/2015.
 */
public class FindMinimumInRotatedSortedArray {

    public int findMin(int[] nums) {
        int first = 0;
        int last = nums.length - 1;

        int mid;
        while (first < last) {
            mid = first + (last - first) / 2;

            if (nums[mid] < nums[last]) {
                last = mid;
            } else {
                first = mid + 1;
            }
        }

        return nums[first];
    }

}

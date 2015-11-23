package org.yli.leetcode;

/**
 * Created by yli on 11/7/2015.
 */
public class FindMinimumInRotatedSortedArrayII {

    public int findMin(int[] nums) {
        int first = 0;
        int last = nums.length - 1;

        int mid;
        while (first < last) {
            mid = first + (last - first) / 2;

            if (nums[mid] < nums[last]) {
                last = mid;
            } else if (nums[mid] > nums[last]) {
                first = mid + 1;
            } else {
                --last;
            }
        }

        return nums[first];
    }

}

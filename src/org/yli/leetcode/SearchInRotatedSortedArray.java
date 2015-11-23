package org.yli.leetcode;

/**
 * Created by yli on 11/7/2015.
 */
public class SearchInRotatedSortedArray {

    public int search(int[] nums, int target) {
        if (nums.length < 1) {
            return -1;
        }

        int first = 0;
        int last = nums.length;

        int mid;
        while (first < last) {
            mid = (first + last) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            if (nums[first] < nums[mid]) {
                if (nums[first] <= target && target < nums[mid]) {
                    last = mid;
                } else {
                    first = mid + 1;
                }
            } else {
                if (nums[mid] < target && target <= nums[last - 1]) {
                    first = mid + 1;
                } else {
                    last = mid;
                }
            }
        }

        return -1;
    }
}

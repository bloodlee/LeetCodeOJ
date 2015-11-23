package org.yli.leetcode;

/**
 * Created by yli on 11/7/2015.
 */
public class SearchInRotatedSortedArrayII {
    public boolean search(int[] nums, int target) {
        if (nums.length < 1) {
            return false;
        }

        int first = 0;
        int last = nums.length;

        int mid;
        while (first < last) {
            mid = (first + last) / 2;

            if (nums[mid] == target) {
                return true;
            }

            if (nums[first] < nums[mid]) {
                if (nums[first] <= target && target < nums[mid]) {
                    last = mid;
                } else {
                    first = mid + 1;
                }
            } else if (nums[first] > nums[mid]) {
                if (nums[mid] < target && target <= nums[last - 1]) {
                    first = mid + 1;
                } else {
                    last = mid;
                }
            } else {
                ++first;
            }
        }

        return false;
    }
}

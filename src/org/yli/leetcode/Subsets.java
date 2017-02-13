package org.yli.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by yli on 1/18/16.
 */
public class Subsets {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();

        Arrays.sort(nums);

        int count = 1 << nums.length;

        for (int i = 0; i < count; ++i) {

            int index = 1;

            List<Integer> aList = new ArrayList<Integer>();

            for (int j = 0; j < nums.length; ++j) {
                if ((i & index) != 0) {
                    aList.add(nums[j]);
                }

                index <<= 1;
            }

            res.add(aList);
        }

        return res;
    }

}

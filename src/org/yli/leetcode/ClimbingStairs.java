package org.yli.leetcode;

/**
 * Created by jali on 7/24/2015.
 */
public class ClimbingStairs {
    public int climbStairs(int n) {
        if (n == 0) {
            return 0;
        }


        int p = 1, q = 1;
        int temp;
        for (int i = 2; i <= n; ++i) {
            temp = q;
            q += p;
            p = temp;
        }

        return q;
    }
}

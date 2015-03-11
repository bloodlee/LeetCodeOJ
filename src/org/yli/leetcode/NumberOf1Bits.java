package org.yli.leetcode;

/**
 * Created by yli on 3/10/15.
 */
public class NumberOf1Bits {
    public int hammingWeight(int n) {
        long unsignedValue = n & 0xffffffffl;
        int sum = 0;
        while (unsignedValue > 0) {
            sum += unsignedValue & 1;
            unsignedValue /= 2;
        }
        return sum;
    }
}

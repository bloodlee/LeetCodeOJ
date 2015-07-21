package org.yli.leetcode;

/**
 * Created by jali on 7/20/2015.
 */
public class AddBinary {
    public String addBinary(String a, String b) {
        int aLen = a.length();
        int bLen = b.length();

        int max = aLen > bLen ? aLen : bLen;

        StringBuilder sb = new StringBuilder();

        int i = 1;
        int extra = 0;
        while (i <= max) {
            int digitA = getDigit(a, aLen, i);

            int digitB = getDigit(b, bLen, i);

            int end = digitA + digitB + extra;

            if (end >= 2) {
                end -= 2;
                extra = 1;
            } else {
                extra = 0;
            }

            sb.insert(0, end);

            ++i;
        }

        if (extra == 1) {
            sb.insert(0, extra);
        }

        return sb.toString();
    }

    private int getDigit(String str, int len, int i) {
        int digit = 0;
        if (i <= len) {
            digit = str.charAt(len - i) - '0';
        }
        return digit;
    }
}

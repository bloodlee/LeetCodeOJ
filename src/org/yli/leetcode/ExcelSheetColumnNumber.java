package org.yli.leetcode;

/**
 * Created by yli on 3/17/2015.
 */
public class ExcelSheetColumnNumber {
    public int titleToNumber(String s) {
        s = s.toUpperCase();
        int sum = 0;
        for (char c : s.toCharArray()) {
            sum *= 26;
            sum += c - 'A' + 1;
        }

        return sum;
    }
}

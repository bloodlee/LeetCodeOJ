package org.yli.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jali on 7/30/2015.
 */
public class ExcelSheetColumnTitle {
    public String convertToTitle(int n) {
        StringBuilder sb = new StringBuilder();

        int mod;
        while (n > 0) {
            mod = (n - 1) % 26;
            sb.insert(0, Character.toString((char) ('A' + mod)));
            n -= mod;
            n /= 26;
        }

        return sb.toString();
    }
}

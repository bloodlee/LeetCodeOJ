package org.yli.leetcode;

/**
 * Created by jali on 7/30/2015.
 */
public class CompareVersionNumbers {
    public int compareVersion(String version1, String version2) {
        String[] segments1 = version1.split("\\.");
        String[] segments2 = version2.split("\\.");

        int minLen = segments1.length < segments2.length ? segments1.length
                : segments2.length;

        int num1 = 0;
        int num2 = 0;
        for (int i = 0; i < minLen; ++i) {
            num1 = Integer.valueOf(segments1[i]);
            num2 = Integer.valueOf(segments2[i]);

            if (num1 > num2) {
                return 1;
            } else if (num1 < num2) {
                return -1;
            }
        }

        if (segments1.length > minLen) {
            for (int i = minLen; i < segments1.length; ++i) {
                if (0 != Integer.valueOf(segments1[i])) {
                    return 1;
                }
            }
        } else if (segments2.length > minLen) {
            for (int i = minLen; i < segments2.length; ++i) {
                if (0 != Integer.valueOf(segments2[i])) {
                    return -1;
                }
            }
        }

        return 0;
    }
}

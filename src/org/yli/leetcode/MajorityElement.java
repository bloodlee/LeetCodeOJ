package org.yli.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by yli on 3/18/2015.
 */
public class MajorityElement {
    public int majorityElement(int[] num) {

        Map<Integer, Integer> records = new HashMap<Integer, Integer>();

        for (int i = 0; i < num.length; ++i) {
            if (!records.containsKey(num[i])) {
                records.put(num[i], 0);
            }

            records.put(num[i], records.get(num[i]) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : records.entrySet()) {
            if (entry.getValue() > num.length / 2) {
                return entry.getKey();
            }
        }

        return -1;
    }

    public int majorityElement2(int[] num) {
        int m = 0, n = 0;

        for (int i : num) {
            if (m == i) {
                ++n;
            } else if (n == 0) {
                m = i;
                n = 1;
            } else {
                --n;
            }
        }

        n = 0;
        for (int i : num) {
            if (i == m) {
                ++n;
            }
        }

        if (n > num.length / 2) {
            return m;
        } else {
            return -1;
        }
    }
}

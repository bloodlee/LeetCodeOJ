package org.yli.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yli on 3/10/15.
 */
public class Permutations {
    public List<List<Integer>> permute(int[] num) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();

        if (num != null) {
            final int count = num.length;

            for (int i = 0; i < count; ++i) {
                // remove num[i] from num array
                int[] subNum = new int[count - 1];
                int index = 0;
                for (int j = 0; j < count; ++j) {
                    if (j != i) {
                        subNum[index++] = num[j];
                    }
                }

                // redo permute
                List<List<Integer>> subResult = permute(subNum);

                if (!subResult.isEmpty()) {
                    for (List<Integer> subList : subResult) {
                        List<Integer> aList = new ArrayList<Integer>();
                        aList.add(num[i]);
                        aList.addAll(subList);
                        result.add(aList);
                    }
                } else {
                    List<Integer> aList = new ArrayList<Integer>();
                    aList.add(num[i]);
                    result.add(aList);
                }
            }
        }

        return result;
    }
}

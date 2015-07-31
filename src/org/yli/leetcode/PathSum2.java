package org.yli.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by jali on 7/30/2015.
 */
public class PathSum2 {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> results = new ArrayList<List<Integer>>();

        if (root == null) {
            return results;
        }

        if (root.val == sum && (root.left == null && root.right == null)) {
            List<Integer> result = new ArrayList<Integer>();
            result.add(root.val);
            results.add(result);
        } else {
            List<List<Integer>> leftResult = pathSum(root.left, sum - root.val);
            List<List<Integer>> rightResult = pathSum(root.right, sum - root.val);

            for (List<List<Integer>> aResult : Arrays.asList(leftResult, rightResult)) {
                if (!aResult.isEmpty()) {
                    for (List<Integer> aPath : aResult) {
                        aPath.add(0, root.val);
                        results.add(aPath);
                    }
                }
            }
        }

        return results;
    }
}

package org.yli.leetcode;

/**
 * Created by yli on 7/19/15.
 */
public class PathSum {

  public boolean hasPathSum(TreeNode root, int sum) {
    if (root == null) {
      return false;
    }

    if (root.val == sum && (root.left == null && root.right == null)) {
      return true;
    } else {
      return hasPathSum(root.left, sum - root.val)
          || hasPathSum(root.right, sum - root.val);
    }
  }

}

package org.yli.leetcode;

/**
 * Created by yli on 6/14/2015.
 */
public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }

        if (!compareNode(root.left, root.right)) {
            return false;
        } else {
            return isSymmetric(root.left, root.right);
        }

    }

    private boolean isSymmetric(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }

        if (!compareNode(left.left, right.right)) {
            return false;
        }

        if (!compareNode(left.right, right.left)) {
            return false;
        }

        return isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left);
    }

    private boolean compareNode(TreeNode left, TreeNode right) {
        if (left != null && right == null) {
            return false;
        } else if (left == null && right != null) {
            return false;
        } else if (left == null && right == null) {
            return true;
        } else if (left.val != right.val) {
            return false;
        } else {
            return true;
        }
    }


}

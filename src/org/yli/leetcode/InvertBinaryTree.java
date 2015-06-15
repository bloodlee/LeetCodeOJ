package org.yli.leetcode;

/**
 * Created by yli on 6/14/2015.
 */
public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if (root != null) {
            TreeNode tmp = root.left;
            root.left = root.right;
            root.right = tmp;

            invertTree(root.left);
            invertTree(root.right);
        }

        return root;
    }
}

package org.yli.leetcode;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by yli on 1/17/16.
 */
public class MaximumDepthOfBinaryTreeTest {

    private MaximumDepthOfBinaryTree util = new MaximumDepthOfBinaryTree();

    @Test
    public void testSimple() {
        assertEquals(0, util.maxDepth(null));

        TreeNode treeNode = new TreeNode(4);
        TreeNode treeNode1 = new TreeNode(2);
        TreeNode treeNode2 = new TreeNode(7);
        TreeNode treeNode3 = new TreeNode(1);
        TreeNode treeNode4 = new TreeNode(3);
        TreeNode treeNode5 = new TreeNode(6);
        TreeNode treeNode6 = new TreeNode(9);

        treeNode.left = treeNode1;
        treeNode.right = treeNode2;

        treeNode1.left = treeNode3;
        treeNode1.right = treeNode4;

        treeNode2.left = treeNode5;
        treeNode2.right = treeNode6;

        treeNode5.left = new TreeNode(10);

        assertEquals(4, util.maxDepth(treeNode));
    }



}

package org.yli.leetcode;

import org.junit.Test;
import sun.reflect.generics.tree.Tree;

import static org.junit.Assert.assertEquals;

/**
 * Created by yli on 6/14/2015.
 */
public class InvertBinaryTreeTest {

    @Test
    public void testSimple() {
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

        InvertBinaryTree utility = new InvertBinaryTree();

        utility.invertTree(treeNode);

        assertEquals(4, treeNode.val);
        assertEquals(7, treeNode.left.val);
        assertEquals(2, treeNode.right.val);
        assertEquals(9, treeNode.left.left.val);
        assertEquals(6, treeNode.left.right.val);

        assertEquals(3, treeNode.right.left.val);
        assertEquals(1, treeNode.right.right.val);
    }

}

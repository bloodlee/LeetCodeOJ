package org.yli.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by yli on 3/19/2015.
 */
public class SameTreeTest {

    private SameTree utilities = new SameTree();

    @Test
    public void testSimple1() {
        TreeNode node1 = new TreeNode(7);
        node1.left = new TreeNode(8);
        node1.right = new TreeNode(8);

        TreeNode node2 = new TreeNode(7);
        node2.left = new TreeNode(8);
        node2.right = new TreeNode(8);

        assertTrue(utilities.isSameTree(node1, node2));
    }

}

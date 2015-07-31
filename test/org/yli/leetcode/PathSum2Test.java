package org.yli.leetcode;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by jali on 7/30/2015.
 */
public class PathSum2Test {
    private PathSum2 pathSum = new PathSum2();
    private TreeNode root;

    @Before
    public void setup() {
        root = new TreeNode(5);
        TreeNode node1 = new TreeNode(4);
        TreeNode node2 = new TreeNode(8);

        root.left = node1;
        root.right = node2;

        TreeNode node3 = new TreeNode(11);

        node1.left = node3;

        TreeNode node4 = new TreeNode(13);
        TreeNode node5 = new TreeNode(4);

        node2.left = node4;
        node2.right = node5;

        TreeNode node6 = new TreeNode(7);
        TreeNode node7 = new TreeNode(2);

        node3.left = node6;
        node3.right = node7;

        TreeNode node8 = new TreeNode(1);
        TreeNode node9 = new TreeNode(5);

        node5.left = node9;
        node5.right = node8;
    }

    @Test
    public void testSimple() {
        List<List<Integer>> results = pathSum.pathSum(root, 22);
        assertEquals(2, results.size());
        assertArrayEquals(new Integer[] {5, 4, 11, 2}, results.get(0).toArray(new Integer[]{}));
        assertArrayEquals(new Integer[] {5, 8, 4, 5}, results.get(1).toArray(new Integer[]{}));
    }
}

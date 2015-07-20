package org.yli.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by yli on 7/19/15.
 */
public class PathSumTest {

  private PathSum pathSum = new PathSum();
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

    node5.right = node8;
  }

  @Test
  public void testSimple() {
    assertFalse(pathSum.hasPathSum(null, 0));
    assertTrue(pathSum.hasPathSum(root, 22));
    assertTrue(pathSum.hasPathSum(root, 26));
    assertFalse(pathSum.hasPathSum(root, 19));
  }

}

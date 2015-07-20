package org.yli.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by yli on 7/19/15.
 */
public class BinaryTreeLevelOrderTraversal {

  public List<List<Integer>> levelOrder(TreeNode root) {
    List<List<Integer>> results = new ArrayList<List<Integer>>();

    if (root == null) {
      return results;
    }

    List<TreeNode> nodes = new ArrayList<TreeNode>();
    int index = 0;
    int dest = 1;
    nodes.add(root);

    while (index < dest) {
      List<Integer> aList = new ArrayList<Integer>();
      int newAdded = 0;
      for (; index < dest; ++index) {
        TreeNode treeNode = nodes.get(index);
        aList.add(treeNode.val);

        if (treeNode.left != null) {
          nodes.add(treeNode.left);
          ++newAdded;
        }

        if (treeNode.right != null) {
          nodes.add(treeNode.right);
          ++newAdded;
        }
      }
      results.add(aList);
      dest += newAdded;
    }

    return results;
  }
}

package org.yli.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by yli on 7/8/2016.
 */
public class BinaryTreeInorderTraversal {
  public List<Integer> inorderTraversal(TreeNode root) {
    List<Integer> finalList = new ArrayList<Integer>();

    if (root != null) {
      doInOrderTraversal(root, finalList);
    }

    return finalList;
  }

  private void doInOrderTraversal(TreeNode root, List<Integer> finalList) {
    Stack<TreeNode> stack = new Stack<TreeNode>();

    stack.push(root);

    addLeftTree(root, stack);

    while (!stack.isEmpty()) {
      TreeNode p2 = stack.pop();
      finalList.add(p2.val);

      if (p2.right != null) {
        stack.push(p2.right);

        addLeftTree(p2.right, stack);
      }
    }
  }

  private void addLeftTree(TreeNode node, Stack<TreeNode> stack) {
    TreeNode p1 = node.left;
    while (p1 != null) {
      stack.push(p1);

      p1 = p1.left;
    }
  }
}

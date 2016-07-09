package org.yli.leetcode;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

/**
 * Created by yli on 7/8/2016.
 */
public class BinaryTreePostorderTraversal {

  public List<Integer> postorderTraversal(TreeNode root) {
    List<Integer> finalList = new ArrayList<Integer>();

    if (root != null) {
      doPostOrderTraversal(root, finalList);

      doPostOrderTraversal2(root, finalList);
    }

    return finalList;
  }

  private void doPostOrderTraversal2(TreeNode root, List<Integer> finalList) {
    Stack<TreeNode> stack = new Stack<TreeNode>();

    stack.add(root);

    while (!stack.isEmpty()) {
      TreeNode node = stack.pop();

      finalList.add(node.val);

      if (node.left != null) {
        stack.push(node.left);
      }

      if (node.right != null) {
        stack.push(node.right);
      }
    }

    Collections.reverse(finalList);
  }

  private void doPostOrderTraversal(TreeNode root, List<Integer> finalList) {
    if (root == null) {
      return;
    }

    doPostOrderTraversal(root.left, finalList);
    doPostOrderTraversal(root.right, finalList);
    finalList.add(root.val);
  }

  
}

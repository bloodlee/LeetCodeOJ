package org.yli.leetcode;

/**
 * Created by yli on 7/19/15.
 */
public class DeleteNodeInList {

  public void deleteNode(ListNode node) {
    while (node != null) {
      if (node.next != null) {
        node.val = node.next.val;
      }
      if (node.next.next == null) {
        node.next = null;
      }
      node = node.next;
    }
  }

}

package org.yli.leetcode;

/**
 * Created by yli on 7/21/15.
 */
public class ReorderList {
  public void reorderList(ListNode head) {
    if (head == null) {
      return;
    }

    int len = getListLen(head);
    if (len == 1) {
      return;
    }

    int middle = len / 2;

    ListNode middleNode = toMiddleNode(head, middle);
    ListNode reverseMiddleHead = reverseList(middleNode.next);
    middleNode.next = null;

    ListNode p = head;
    ListNode q = reverseMiddleHead;

    ListNode swap1;
    ListNode swap2;
    for (int i = 0; i < middle; ++i) {
      if (p == null || q == null) {
        break;
      }

      swap1 = p.next;
      swap2 = q.next;

      p.next = q;
      q.next = swap1;

      p = swap1;
      q = swap2;
    }
  }

  private ListNode reverseList(ListNode head) {
    ListNode p = head;
    ListNode q = null;
    ListNode swap;

    while (p != null) {
      swap = p.next;
      p.next = q;

      q = p;
      p = swap;
    }

    return q;
  }

  private ListNode toMiddleNode(ListNode head, int middle) {
    ListNode p = head;
    while (middle > 0) {
      p = p.next;
      --middle;
    }
    return p;
  }

  private int getListLen(ListNode p) {
    int count = 0;
    while (p != null) {
      ++count;
      p = p.next;
    }
    return count;
  }
}

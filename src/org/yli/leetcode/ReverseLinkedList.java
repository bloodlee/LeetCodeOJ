package org.yli.leetcode;

/**
 * Created by yli on 7/30/2015.
 */
public class ReverseLinkedList {
  public ListNode reverseList(ListNode head) {
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
}

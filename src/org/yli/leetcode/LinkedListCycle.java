package org.yli.leetcode;

/**
 * Created by yli on 7/21/15.
 */
public class LinkedListCycle {
  public boolean hasCycle(ListNode head) {
    if (head == null) {
      return false;
    }

    ListNode p, q;
    p = q = head;

    do {
      p = p.next;

      if (q.next != null) {
        q = q.next.next;
      } else {
        q = q.next;
      }

      if (p == null || q == null) {
        return false;
      }

      if (p == q) {
        return true;
      }
    } while (true);
  }
}

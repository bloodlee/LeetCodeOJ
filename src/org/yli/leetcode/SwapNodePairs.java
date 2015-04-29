package org.yli.leetcode;

public class SwapNodePairs {

  public ListNode swapPairs(ListNode head) {
    if (head == null) {
      return null;
    }

    ListNode newHead = null;
    ListNode p1;
    ListNode p2;
    ListNode p3 = null;

    do {
      p1 = head;
      p2 = head.next;

      if (p1 != null && p2 != null) {
        head = p2.next;

        p1.next = p2.next;
        p2.next = p1;

        if (p3 != null) {
          p3.next = p2;
        }

        if (newHead == null) {
          newHead = p2;
        }

        p3 = p1;

      } else if (p1 != null && p2 == null) {
        if (newHead == null) {
          newHead = p1;
        }
        break;
      }

    } while (head != null);

    return newHead;
  }

}

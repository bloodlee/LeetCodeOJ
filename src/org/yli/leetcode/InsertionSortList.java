package org.yli.leetcode;

/**
 * Created by yli on 4/28/15.
 */
public class InsertionSortList {

  public ListNode insertionSortList(ListNode head) {
    if (head == null) {
      return null;
    }

    ListNode sortListHead = new ListNode(0);
    sortListHead.next = new ListNode(head.val);

    ListNode p1;
    ListNode p2;
    ListNode p3;
    while (head.next != null) {
      p1 = head.next;
      p2 = sortListHead.next;
      p3 = sortListHead;

      while (p2 != null && p2.val < p1.val) {
        p2 = p2.next;
        p3 = p3.next;
      }

      ListNode newNode = new ListNode(p1.val);
      p3.next = newNode;
      newNode.next = p2;

      head = head.next;
    }

    return sortListHead.next;
  }

}

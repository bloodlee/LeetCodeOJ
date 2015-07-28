package org.yli.leetcode;

/**
 * Created by yli on 7/20/15.
 */
public class IntersectionOfTwoLinkedLists {
  public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    if (headA == null || headB == null) {
      return null;
    }

    int aLen = getListLen(headA);
    int bLen = getListLen(headB);

    ListNode longestList = aLen > bLen ? headA : headB;
    ListNode shortestList = aLen > bLen ? headB : headA;
    int diff = aLen - bLen;
    if (diff < 0) {
      diff *= -1;
    }

    for (int i = 0; i < diff; ++i) {
      longestList = longestList.next;
    }

    while (longestList != null && shortestList != null) {
      if (longestList == shortestList) {
        return longestList;
      }

      longestList = longestList.next;
      shortestList = shortestList.next;
    }

    return null;
  }

  private int getListLen(ListNode list) {
    if (list != null) {
      ListNode p = list;
      int count = 0;
      while (p != null) {
        ++count;
        p = p.next;
      }
      return count;
    }
    return 0;
  }
}

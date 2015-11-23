package org.yli.leetcode;

/**
 * Created by yli on 11/9/2015.
 */
public class ReverseLinkedListII {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode dummyHeader = new ListNode(0);
        dummyHeader.next = head;

        ListNode p = dummyHeader;
        for (int i = 0; i < m; ++i) {
            p = p.next;
        }

        ListNode header2 = p;
        for (int i = 0; i < n - m; ++i) {
            header2 = header2.next;

        }

        return dummyHeader.next;
    }
}

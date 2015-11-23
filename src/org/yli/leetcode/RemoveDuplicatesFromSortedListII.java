package org.yli.leetcode;

/**
 * Created by yli on 11/10/2015.
 */
public class RemoveDuplicatesFromSortedListII {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return head;
        }

        ListNode dummyHeader = new ListNode(Integer.MAX_VALUE);
        dummyHeader.next = head;

        ListNode p = dummyHeader;
        ListNode q = dummyHeader.next;
        ListNode r = q.next;

        while (r != null) {
            if (q.val == r.val) {
                q = p;
            } else {
                p = p.next;
                q = q.next;
            }
            r = r.next;
        }
        q.next = r;

        return dummyHeader.next;
    }
}

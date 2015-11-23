package org.yli.leetcode;

/**
 * Created by yli on 11/10/2015.
 */
public class RemoveDuplicatesFromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return head;
        }

        ListNode p = head;
        ListNode q = p.next;
        int val = head.val;
        while (q != null) {
            if (val != q.val) {
                p.next = q;
                p = q;
                val = q.val;
            }
            q = q.next;
        }
        p.next = q;

        return head;
    }
}

package org.yli.leetcode;

/**
 * Created by jali on 7/30/2015.
 */
public class RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        }

        ListNode beforeHead = new ListNode(-1);
        beforeHead.next = head;

        ListNode p = beforeHead;
        while (head != null) {
            if (head.val == val) {
                head = head.next;
                p.next = head;
            } else {
                p = p.next;
                head = head.next;
            }
        }

        return beforeHead.next;
    }
}

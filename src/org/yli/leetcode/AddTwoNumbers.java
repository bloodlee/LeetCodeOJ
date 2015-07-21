package org.yli.leetcode;

import java.util.List;

/**
 * Created by jali on 7/20/2015.
 */
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode header = new ListNode(0);

        ListNode p = header;

        int extra = 0;
        int num = 0;
        while (l1 != null && l2 != null) {
            num = l1.val + l2.val + extra;
            if (num >= 10) {
                extra = 1;
                num %= 10;
            } else {
                extra = 0;
            }
            ListNode q = new ListNode(num);
            p.next = q;
            p = q;

            l1 = l1.next;
            l2 = l2.next;
        }

        ListNode l = (l1 != null) ? l1 : l2;
        while (l != null) {
            num = l.val + extra;
            if (num >= 10) {
                extra = 1;
                num %= 10;
            } else {
                extra = 0;
            }
            ListNode q = new ListNode(num);
            p.next = q;
            p = q;

            l = l.next;
        }

        if (extra == 1) {
            ListNode q = new ListNode(extra);
            p.next = q;
        }

        return header.next;
    }
}

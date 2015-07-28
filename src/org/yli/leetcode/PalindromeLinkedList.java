package org.yli.leetcode;

/**
 * Created by jali on 7/21/2015.
 */
public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        if (head == null) {
            return true;
        }

        int len = getLen(head);
        if (len == 1) {
            return true;
        }

        int middle = (len % 2 == 0) ? (len / 2) : (len / 2 + 1);

        ListNode middleNode = toMiddleNode(head, middle);
        ListNode reverseMiddleHead = reverseList(middleNode);

        ListNode p = head;
        ListNode q = reverseMiddleHead;

        for (int i = 0; i < middle; ++i) {
            if (p == null || q == null) {
                break;
            }

            if  (p.val != q.val) {
                return false;
            }
            p = p.next;
            q = q.next;
        }

        reverseList(reverseMiddleHead);

        return true;
    }

    private ListNode reverseList(ListNode head) {
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

    private ListNode toMiddleNode(ListNode head, int middle) {
        ListNode p = head;
        while (middle > 0) {
            p = p.next;
            --middle;
        }
        return p;
    }

    private int getLen(ListNode p) {
        int len = 0;
        while (p != null) {
            ++len;
            p = p.next;
        }
        return len;
    }
}

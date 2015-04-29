package org.yli.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by yli on 4/28/15.
 */
public class SwapNodePairsTest {

  private SwapNodePairs utility = new SwapNodePairs();

  @Test
  public void testSimple() {
    ListNode node1 = new ListNode(3);
    ListNode node2 = new ListNode(4);
    ListNode node3 = new ListNode(5);
    ListNode node4 = new ListNode(6);
    ListNode node5 = new ListNode(7);

    node1.next = node2;
    node2.next = node3;
    node3.next = node4;
    node4.next = node5;

    ListNode head = utility.swapPairs(node1);

    assertEquals(4, head.val);
    assertEquals(3, head.next.val);
    assertEquals(6, head.next.next.val);
    assertEquals(5, head.next.next.next.val);
    assertEquals(7, head.next.next.next.next.val);
  }

}

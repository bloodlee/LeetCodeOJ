package org.yli.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by yli on 4/28/15.
 */
public class InsertionSortListTest {

  private InsertionSortList utility = new InsertionSortList();

  @Test
  public void testSimple1() {
    ListNode node1 = new ListNode(7);
    ListNode node2 = new ListNode(6);
    ListNode node3 = new ListNode(3);
    ListNode node4 = new ListNode(4);
    ListNode node5 = new ListNode(5);

    node1.next = node2;
    node2.next = node3;
    node3.next = node4;
    node4.next = node5;

    ListNode head = utility.insertionSortList(node1);

    assertEquals(3, head.val);
    assertEquals(4, head.next.val);
    assertEquals(5, head.next.next.val);
    assertEquals(6, head.next.next.next.val);
    assertEquals(7, head.next.next.next.next.val);
    assertEquals(null, head.next.next.next.next.next);
  }

  @Test
  public void testSimple2() {
    ListNode node1 = new ListNode(2);
    ListNode node2 = new ListNode(2);

    node1.next = node2;

    ListNode head = utility.insertionSortList(node1);

    assertEquals(2, head.val);
    assertEquals(2, head.next.val);
    assertEquals(null, head.next.next);
  }
}

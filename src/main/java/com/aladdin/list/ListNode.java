package com.aladdin.list;


import java.util.ArrayList;
import java.util.List;

public class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

    public ListNode() {
    }

    @Override
    public String toString() {
        return "[" +
                val +
                ']';
    }

    static List<ListNode> print(ListNode head) {
        List<ListNode> listNodes = new ArrayList();
        ListNode listNode;
        listNodes.add(head == null ? null : head);
        while (head.next != null) {
            listNode = head.next;
            listNodes.add(listNode);
            head = listNode;
        }
        return listNodes;
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(5);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;

        ListNode listNode6 = new ListNode();
        Solution solution = listNode6.new Solution();
        System.out.println(print(solution.reverseList(listNode1)));

        ListNode listNode = new ListNode(6);
        listNode.next = null;

    }

    class Solution {

        public ListNode reverseList(ListNode head) {

            if (head == null || head.next == null) {
                return head;
            }
            ListNode newHead = reverseList(head.next);
            head.next.next = head;
//        head.next=null;
            return newHead;
        }

    }
}


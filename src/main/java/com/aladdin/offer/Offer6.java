package com.aladdin.offer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
 * 示例 1：
 * 输入：head = [1,3,2]
 * 输出：[2,3,1]
 *
 * @author lgc
 **/
public class Offer6 {
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
        Offer6 offer6 = new Offer6();
        int[] ints = offer6.reversePrint(listNode1);
        System.out.println(Arrays.toString(ints));
        System.out.println(Arrays.toString(offer6.reversePrint1(listNode1)));
        System.out.println(Arrays.toString(offer6.reversePrint2(listNode1)));
    }

    public int[] reversePrint(ListNode head) {
        List<Integer> list = addNode(head);
        int[] ints = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ints[i] = list.get(i);
        }
        return ints;
    }

    public List<Integer> addNode(ListNode head) {
        List<Integer> integers = new ArrayList<>();
        if (head == null) {
            return integers;
        }
        integers = addNode(head.next);
        integers.add(head.val);
        return integers;
    }

    public int[] reversePrint1(ListNode head) {
        ListNode node = head;
        int count = 0;
        while (node != null) {
            count++;
            node = node.next;
        }
        node = head;
        int[] ints1 = new int[count];
        for (int i = ints1.length - 1; i >= 0; --i) {
            ints1[i] = node.val;
            node = node.next;
        }
        return ints1;
    }

    public int[] reversePrint2(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        while (head != null) {
            stack.push(head.val);
            head = head.next;
        }
        int[] res = new int[stack.size()];
        int cnt = 0;
        while (!stack.isEmpty()) {
            res[cnt++] = stack.pop();
        }
        return res;
    }


}
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

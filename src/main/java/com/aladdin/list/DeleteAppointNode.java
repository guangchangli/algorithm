package com.aladdin.list;

/**
 * 删除链表倒数第N个结点
 * @Author gopher lee
 * @Date 2020/8/24 00:02
 */
public class DeleteAppointNode {
    public static void main(String[] args) {
        //build node list
        ListNode listNode1 = new ListNode();
        ListNode listNode2 = new ListNode();
        ListNode listNode3 = new ListNode();
        ListNode listNode4 = new ListNode();
        ListNode listNode5 = new ListNode();
        listNode1.val=1;
        listNode2.val=2;
        listNode3.val=3;
        listNode4.val=4;
        listNode5.val=5;
        listNode1.next=listNode2;
        listNode2.next=listNode3;
        listNode3.next=listNode4;
        listNode4.next=listNode5;
        listNode5.next=null;

        //solution
        solution(listNode1,2);
    }

    static ListNode solution(ListNode  head,int appoint){
        ListNode fast = head;
        ListNode slow = head;
        for (int j = 0; j < appoint; j++) {
            fast = fast.next;
        }
        if (fast == null) {//此时删除的是第一个节点
            return head.next;
        }
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;//删除slow.next
        ListNode.print(head);
        return head;
    }
}

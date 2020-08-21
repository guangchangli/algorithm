package com.aladdin.list;

import java.util.Arrays;
import java.util.Stack;

/**
 * 单链表反转使用 stack
 * @author lgc
 */
public class LinkedList {

    private LinkedList next;
    private int value;

    public LinkedList(int value) {
        this.value = value;
    }

    public LinkedList() {
    }

    @Override
    public String toString() {
        return "[" + value +
                ']';
    }

    static class solution {
        public static void main(String[] args) {
            LinkedList one = new LinkedList(1);
            LinkedList two = new LinkedList(2);
            LinkedList three = new LinkedList(3);
            one.next = two;
            two.next = three;
            three.next = null;
            reverseLinkedList(one);

        }

        static void reverseLinkedList(LinkedList head) {
            Stack<Integer> stack = new Stack<>();
            LinkedList current = head;
            while (current != null) {
                stack.add(current.value);
                current = current.next;
            }
            int[] res = new int[stack.size()];
            for (int i = 0; i < res.length; i++) {
                Integer pop = stack.pop();
                res[i] = pop;
            }
            System.out.println(Arrays.toString(res));
        }
    }
}


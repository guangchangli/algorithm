package com.aladdin;

import com.aladdin.list.MyNode;
import com.aladdin.list.SingleList;

/**
 * 反转单链表
 *
 * @author lgc
 **/
public class ReverseSingleList {
    public static void main(String[] args) {
        SingleList singleList = new SingleList();
        singleList.inert(1);
        singleList.inert(2);
        singleList.inert(3);
        singleList.inert(4);
        singleList.inert(5);
        System.out.println(singleList.print());
        //reverse
        System.out.println(reverseSingleList(singleList).print());
    }
    public static SingleList reverseSingleList(SingleList singleList){
        MyNode head = singleList.getHead();
        if (head==null){
            return null;
        }
        if (head.getNext()==null){
            return singleList;
        }
        MyNode n = head.getNext();
        MyNode nn = n.getNext();
        while (nn!=null) {
            head.setNext(null);
            n.setNext(head);
            //后移
            head=n;
            n=nn;
            nn=nn.getNext();
        }
        //nn == null
        n.setNext(head);
        singleList.setHead(n);
        return singleList;

    }
}

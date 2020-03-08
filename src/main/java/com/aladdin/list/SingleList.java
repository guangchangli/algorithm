package com.aladdin.list;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lgc
 **/

public class SingleList {
    private MyNode head;

    public MyNode getHead() {
        return head;
    }


    public void setHead(MyNode head) {
        this.head = head;
    }

    public SingleList() {
    }

    @Override
    public String toString() {
        return "SingleList[" +
                "head=" + head +
                ']';
    }

    /**
     * 添加
     */
    public void inert(int value){
        if (head==null){
            MyNode myNode = new MyNode();
            head=myNode;
            head.setValue(value);
            head.setNext(null);
            return;
        }
        MyNode tem=head;
        while (tem.getNext()!=null) {
            MyNode next = tem.getNext();
            tem = next;
        }
        MyNode myNode = new MyNode();
        myNode.setValue(value);
        myNode.setNext(null);
        tem.setNext(myNode);
    }
    public String print(){
        if (head==null){
            return "";
        }
        List<Integer> integers = new ArrayList<>();
        integers.add(head.getValue());
        MyNode tem=head;
        while (tem.getNext()!=null){
            integers.add(tem.getNext().getValue());
            tem=tem.getNext();
        }
        return integers.toString();
    }
}

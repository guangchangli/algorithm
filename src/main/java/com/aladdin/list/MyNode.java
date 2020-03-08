package com.aladdin.list;

public  class MyNode {
        private MyNode next;
        private int value;

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public MyNode(MyNode next) {
            this.next = next;
        }

        public MyNode getNext() {
            return next;
        }

        public void setNext(MyNode next) {
            this.next = next;
        }

        public MyNode() {
        }

        @Override
        public String toString() {
            return "MyNode[" +
                    "next=" + next +
                    ", value=" + value +
                    ']';
        }
    }
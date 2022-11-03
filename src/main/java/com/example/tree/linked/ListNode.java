package com.example.tree.linked;

public class ListNode {

    int value;

    ListNode head;

    ListNode next;

    ListNode tail;


    public ListNode getHead() {
        return head;
    }

    public void setHead(ListNode head) {
        this.head = head;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    public ListNode getTail() {
        return tail;
    }

    public void setTail(ListNode tail) {
        this.tail = tail;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public ListNode(int value) {
        this.value = value;
    }
    public ListNode() {

    }
}

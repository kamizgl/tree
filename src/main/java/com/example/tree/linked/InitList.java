package com.example.tree.linked;

public class InitList {

    static ListNode getListNode() {
        ListNode listNode = new ListNode(1);
        listNode.setHead(listNode);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        listNode.setNext(listNode2);
        listNode2.setNext(listNode3);
        return listNode;
    }

    static ListNode getListNodeCycle() {
        ListNode listNode = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        listNode.setNext(listNode2);
        listNode2.setNext(listNode3);
        listNode3.setNext(listNode4);
        listNode4.setNext(listNode);
        return listNode;
    }


    static ListNode getList1() {
        ListNode listNode = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        listNode.setNext(listNode2);
        return listNode;
    }

    static ListNode getList2() {
        ListNode listNode = new ListNode(1);
        return listNode;
    }
}

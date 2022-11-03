package com.example.tree.linked;


import static com.example.tree.linked.InitList.getListNode;

/**
 * 找到链表中中间的节点，使用快慢指针一个走一步。 一个走两步
 */
public class MidNode {

    public ListNode getMid(ListNode listNode){
        ListNode mid =null;
        for (; listNode.getNext().getNext()!=null ; listNode=listNode.getNext()){
             mid = listNode.getNext();
        }
        return mid;
    }

    public ListNode getMidWhile(ListNode listNode){

        ListNode  i =listNode;
        ListNode  j =listNode;

        while (j!=null &&j.next!=null){
            i = i.next;
            j = j.next.next;
        }
        return i;
    }

    public static void main(String[] args) {
        ListNode listNode = getListNode();


        MidNode midNode =new MidNode();
        ListNode mid = midNode.getMid(listNode);
        System.out.println(mid.value);

        ListNode midWhile = midNode.getMidWhile(listNode);
        System.out.println(midWhile.value);
    }


}

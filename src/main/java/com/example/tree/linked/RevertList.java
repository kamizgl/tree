package com.example.tree.linked;


public class RevertList {

    ListNode reverse(ListNode head) {
        if (head.next == null){
            return head;
        }
        ListNode last = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return last;
    }


    public ListNode reverseList(ListNode head) {
        //申请节点，pre和 cur，pre指向null
        ListNode pre = null;
        ListNode cur = head;
        ListNode tmp = null;
        while(cur!=null) {
            //记录当前节点的下一个节点
            tmp = cur.next;
            //然后将当前节点指向pre
            cur.next = pre;
            //pre和cur节点都前进一位
            pre = cur;
            cur = tmp;
        }
        return pre;
    }


    /**
     * 反转链表的一部分
     * @param args
     */
    ListNode successor =null;

    public ListNode reverseN(ListNode head , int n){
        if(n==1){
            successor = head.next;
            return head;
        }
        ListNode listNode = reverseN(head.next, n - 1);
        head.next.next=head;
        head.next = successor;
        return listNode;
    }

    public ListNode reverseBetween(ListNode head ,int m , int n ){

        if (m == 1) {
            return reverseN(head, n);
        }

        head.next = reverseBetween(head.next, m - 1, n - 1);
        return head;
    }


    public static void main(String[] args) {
        int[] ints = new int[2];
        System.out.println(ints.length);
        ListNode listNode = InitList.getListNode();
        RevertList revertList = new RevertList();
        ListNode reverse = revertList.reverse(listNode);
        System.out.println(reverse);
    }
}




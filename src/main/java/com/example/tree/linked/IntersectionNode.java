package com.example.tree.linked;

/**
 * 输入两个链表，找出它们的第一个公共节点。
 * A 链表 12345
 * B 链表  9345
 * 找到3
 * 原理只要有一个在原地打转，总会相遇的
 * 数学原理：假设链表A长度是m,链表B长度是n A 不相交的是a 相交部分是c B不相交部分是b 相交部分是c
 * 那么m =a+c
 *    n=b+c
 * 所以 a+c+b =b+c+a
 *  所以当ac走完了就要从b 开始  当bc走完了就要c开始，他们一定就会相遇
 * 所以在他们移动了 abc之和之后就会在第一个公共节点相遇
 */
public class IntersectionNode {

    ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode point1 = headA;
        ListNode point2 = headB;

        //只要不相交你们就一直在里面转吧
        while (point1 != point2) {
            point1 = point1 == null ? headB : point1.next;
            point2 = point2 == null ? headA : point2.next;
        }
        return point1;
    }

    public static void main(String[] args) {

    }
}


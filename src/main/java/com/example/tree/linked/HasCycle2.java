package com.example.tree.linked;

/**
 * 给定一个链表的头节点 返回链表开始入环的第一个节点。如果链表无环，则返回null。
 * <p>
 * 如果链表中有某个节点，可以通过连续跟踪 next 指针再次到达，则链表中存在环。 为了表示给定链表中的环，评测系统内部使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。如果 pos 是 -1，则在该链表中没有环。注意：pos 不作为参数进行传递，仅仅是为了标识链表的实际情况。
 */
public class HasCycle2 {

    public ListNode hasCycle(ListNode head) {

        //使用是一个走一步的指针 和一个走两步的指针 到里面转 如果两个指针相遇了 就是代表有环

        ListNode point1 = head, point2 = head;

        while (point2 != null && point2.next != null) {
            point1 = point1.next;
            point2 = point2.next.next;
            if (point2 == null) {
                return null;
            }
            if (point1 == null) {
                return null;
            }
            if (point1 == point2) {
                point1 = head;
                while (point1!=point2) {
                    point1 = point1.next;
                    point2 = point2.next;
                }
                return point1;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        HasCycle2 hasCycle2 = new HasCycle2();
        ListNode listNode = hasCycle2.hasCycle(InitList.getListNodeCycle());
        System.out.println(listNode.getValue());

    }
}

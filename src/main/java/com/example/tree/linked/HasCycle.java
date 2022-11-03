package com.example.tree.linked;

/**
 * 判断是否有环
 */
public class HasCycle {

    public boolean hasCycle(ListNode listNode) {

        //使用是一个走一步的指针 和一个走两步的指针 到里面转 如果两个指针相遇了 就是代表有环

        ListNode point1 = listNode, point2 = listNode;

        while (point2 != null && point2.getNext() != null) {
            point1 = point1.getNext();
            point2 = point2.getNext().getNext();
            if(point2==null){
                return false;
            }
            if(point1==null){
                return false;
            }
            if (point1.getValue() == point2.getValue()) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        HasCycle hasCycle = new HasCycle();
        boolean b = hasCycle.hasCycle(InitList.getListNodeCycle());
        System.out.println(b);
    }
}

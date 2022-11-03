package com.example.tree.linked;


/**
 * 找到倒数第K个节点
 */
public class KNode {

    /**
     * 双指针解发只要跑一次，搞两个指针，第一个指针在1的位置，第二个指针在k的位置，等到k出界了 第一个指针就是倒数第k的位置
     * @param listNode
     */
    public void getRevertKNode2(ListNode listNode,int k){

        ListNode kNode = listNode;
        ListNode fisrt = listNode;
        for (int i = 0; i < k; i++) {
            kNode = kNode.getNext();
        }
        while (kNode.next!=null){
            kNode = kNode.getNext();
            fisrt = fisrt.getNext();
        }

        System.out.println(fisrt.value);
      //
    }


    public static void main(String[] args) {
        ListNode listNode = InitList.getListNode();
        KNode kNode = new KNode();
        kNode.getRevertKNode2(listNode,2);
    }
}

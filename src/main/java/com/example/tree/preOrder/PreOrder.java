package com.example.tree.preOrder;

import com.example.tree.tree.TreeNode;

public class PreOrder {

    /**
     * 前序遍历， 根节点在前面，然后左节点，然后右节点
     * @param treeNode
     */
    public void preOrder(TreeNode treeNode){

        if(treeNode ==null){
            return;
        }
        System.out.print(treeNode.getData() + " -> ");
        preOrder(treeNode.getLeftNode());
        preOrder(treeNode.getRightNode());
    }

}

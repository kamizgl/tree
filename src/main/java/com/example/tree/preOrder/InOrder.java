package com.example.tree.preOrder;

import com.example.tree.tree.TreeNode;

public class InOrder {


    /**
     * 中序遍历， 左节点，根节点，右节点
     * @param treeNode
     */
    public void inOrder(TreeNode treeNode){

        if(treeNode ==null){
            return;
        }
        inOrder(treeNode.getLeftNode());
        System.out.print(treeNode.getData() + " -> ");
        inOrder(treeNode.getRightNode());
    }
}

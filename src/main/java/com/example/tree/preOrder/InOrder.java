package com.example.tree.preOrder;

import com.example.tree.tree.Node;

public class InOrder {


    /**
     * 中序遍历， 左节点，根节点，右节点
     * @param node
     */
    public void inOrder(Node node){

        if(node==null){
            return;
        }
        inOrder(node.getLeftNode());
        System.out.print(node.getData() + " -> ");
        inOrder(node.getRightNode());
    }
}

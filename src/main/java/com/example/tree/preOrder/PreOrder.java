package com.example.tree.preOrder;

import com.example.tree.tree.Node;

public class PreOrder {

    /**
     * 前序遍历， 根节点在前面，然后左节点，然后右节点
     * @param node
     */
    public void preOrder(Node node){

        if(node==null){
            return;
        }
        System.out.print(node.getData() + " -> ");
        preOrder(node.getLeftNode());
        preOrder(node.getRightNode());
    }

}

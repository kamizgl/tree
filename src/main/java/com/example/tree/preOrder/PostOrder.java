package com.example.tree.preOrder;

import com.example.tree.tree.Node;

public class PostOrder {

    /**
     * 后序遍历  左 右，中
     * @param root
     */
    public void postOrder(Node root){
        if(root==null){
            return;
        }
        postOrder(root.getLeftNode());
        postOrder(root.getRightNode());
        System.out.print(root.getData()+" -> ");
    }
}

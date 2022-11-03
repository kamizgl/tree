package com.example.tree.preOrder;

import com.example.tree.tree.TreeNode;

public class PostOrder {

    /**
     * 后序遍历  左 右，中
     * @param root
     */
    public void postOrder(TreeNode root){
        if(root==null){
            return;
        }
        postOrder(root.getLeftNode());
        postOrder(root.getRightNode());
        System.out.print(root.getData()+" -> ");
    }
}

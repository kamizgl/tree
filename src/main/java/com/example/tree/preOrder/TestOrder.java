package com.example.tree.preOrder;

import com.example.tree.tree.TreeNode;

public class TestOrder {

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode("A",new TreeNode("B",null,null),new TreeNode("C",null,null));
//        PreOrder preOrder = new PreOrder();
//        preOrder.preOrder(node);

//        InOrder inOrder =new InOrder();
//        inOrder.inOrder(node);

        PostOrder postOrder =new PostOrder();
        postOrder.postOrder(treeNode);
    }
}

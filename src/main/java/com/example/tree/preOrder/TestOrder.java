package com.example.tree.preOrder;

import com.example.tree.tree.Node;

public class TestOrder {

    public static void main(String[] args) {
        Node node = new Node("A",new Node("B",null,null),new Node("C",null,null));
//        PreOrder preOrder = new PreOrder();
//        preOrder.preOrder(node);

//        InOrder inOrder =new InOrder();
//        inOrder.inOrder(node);

        PostOrder postOrder =new PostOrder();
        postOrder.postOrder(node);
    }
}

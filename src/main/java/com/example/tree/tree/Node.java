package com.example.tree.tree;

public class Node {
    private String data;
    private Node leftNode;
    private Node rightNode;

    public Node(String data,Node leftNode,Node rightNode){
         this.data = data;
         this.leftNode = leftNode;
         this.rightNode = rightNode;
    }
    public String getData(){
        return this.data;
    }
    public Node getLeftNode(){
        return this.leftNode;
    }
    public Node getRightNode(){
        return this.rightNode;
    }

}
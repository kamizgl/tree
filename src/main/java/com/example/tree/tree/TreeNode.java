package com.example.tree.tree;

public class TreeNode {
    private String data;
    private TreeNode left;
    private TreeNode right;

    public TreeNode(String data, TreeNode left, TreeNode right){
         this.data = data;
         this.left = left;
         this.right = right;
    }
    public String getData(){
        return this.data;
    }
    public TreeNode getLeftNode(){
        return this.left;
    }
    public TreeNode getRightNode(){
        return this.right;
    }

}
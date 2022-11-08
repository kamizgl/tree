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

    public void setData(String data) {
        this.data = data;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    public  TreeNode(String data){
        this.data = data;

    }
}
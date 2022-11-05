package com.example.tree.tree;

public class InitTree {

    public static TreeNode Init(){
        TreeNode treeNode = new TreeNode("3");

        TreeNode treeNode9 = new TreeNode("9");
        TreeNode treeNode20 = new TreeNode("20");

        TreeNode treeNode15 = new TreeNode("15");
        TreeNode treeNode7 = new TreeNode("7");

        treeNode.setLeft(treeNode9);
        treeNode.setRight(treeNode20);
        treeNode20.setRight(treeNode7);
        treeNode20.setLeft(treeNode15);
        return treeNode;
    }
}

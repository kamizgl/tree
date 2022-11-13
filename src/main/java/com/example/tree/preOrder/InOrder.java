package com.example.tree.preOrder;

import com.example.tree.tree.TreeNode;

import java.util.*;

public class InOrder {


    /**
     * 中序遍历， 左节点，根节点，右节点
     * @param treeNode
     */
    public void inOrder(TreeNode treeNode){

        if(treeNode ==null){
            return;
        }
        inOrder(treeNode.getLeftNode());
        System.out.print(treeNode.getData() + " -> ");
        inOrder(treeNode.getRightNode());
    }

    public void inOrderDeque(TreeNode root) {

        List<TreeNode> res = new ArrayList<>();
        Deque<TreeNode> skt = new LinkedList<>();
        while (root != null || !skt.isEmpty()) {
            while (root != null) {
                root = root.getLeftNode();
                skt.push(root);
            }
            root = skt.pop();
            res.add(root);
            root = root.getLeft();
        }
    }
}

package com.example.tree.tree;

/**
 * 二叉树的直径
 */
public class DiameterOfBinaryTree {

    int maxDiameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        int i = maxDepth(root);
        return maxDiameter;
    }

    private int maxDepth(TreeNode root) {

        if (root == null) {
            return 0;
        }
        int left = maxDepth(root.getLeft());
        int right = maxDepth(root.getRightNode());
        int max = left + right;
        maxDiameter = Math.max(max, maxDiameter);
        return 1 + Math.max(left, right);
    }
}

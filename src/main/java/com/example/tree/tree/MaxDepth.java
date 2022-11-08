package com.example.tree.tree;

public class MaxDepth {

    /**
     * 最大深度可以通过子树的最大深度推导出来
     * @param root
     * @return
     */
    public static int maxDepth(TreeNode root) {

        if (root == null) {
            return 0;
        }
        int left = maxDepth(root.getLeftNode());
        int right = maxDepth(root.getRightNode());

        return Math.max(left, right) + 1;
    }

    static int  res = 0;
    static int depth = 0;
    /**
     * 遍历
     */
    public static int maxDepth2(TreeNode root) {
        traverse(root);
        return res;
    }

    // 二叉树遍历框架
    public static void traverse(TreeNode root) {


        if (root == null) {
            return;
        }
        depth++;
        if (root.getLeftNode() == null && root.getRightNode() == null) {
            // 到达叶子节点，更新最大深度
            res = Math.max(res, depth);
        }
        // 前序位置
        traverse(root.getLeftNode());
        traverse(root.getRightNode());
        // 后序位置
        depth--;
    }

    public static void main(String[] args) {
        TreeNode root = InitTree.Init();
        int i = maxDepth(root);
        System.out.println(i);

    }
}

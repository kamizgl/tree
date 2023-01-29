package com.example.tree.erchashu;


class Solution {


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return build(nums, 0, nums.length - 1);
    }

    public TreeNode build(int[] nums, int lo, int hi) {
        System.out.println("lo=" + lo + "---hi=" + hi);
        if (lo > hi) {
            return null;
        }

        int maxValue = Integer.MIN_VALUE;
        int index = -1;
        for (int i = lo; i <= hi; i++) {
            if (maxValue < nums[i]) {
                index = i;
                maxValue = nums[i];
            }
        }
        TreeNode root = new TreeNode(maxValue);
        TreeNode left = build(nums, lo, index - 1);
        TreeNode right = build(nums, index + 1, hi);

        root.left = left;
        root.right = right;
        return root;

    }

    public static void main(String[] args) {
        var a = new int[]{3, 2, 1, 6, 0, 5};

        Solution solution = new Solution();
        solution.constructMaximumBinaryTree(a);
    }
}
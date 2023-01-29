package com.example.tree.preOrder;

import com.example.tree.tree.TreeNode;

public class TestOrder {

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode("A",new TreeNode("B",new TreeNode("D"),new TreeNode("E")),new TreeNode("C",null,null));
//        PreOrder preOrder = new PreOrder();
//        preOrder.preOrder(node);

//        InOrder inOrder =new InOrder();
//        inOrder.inOrder(node);
        TreeNode treeNode2 = new TreeNode("A",null ,new TreeNode("B" , null,new TreeNode("C" ,null ,new TreeNode("D"))));

        TreeNode p = treeNode2;
        while (p.right != null) {
            p = p.right;
        }

        System.out.println(p);

        PostOrder postOrder =new PostOrder();
        postOrder.postOrder(treeNode);

        TestOrder testOrder = new TestOrder();
        int i = testOrder.maxDepth(treeNode);
        System.out.println("----"+i);
    }

    int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        // 利用定义，计算左右子树的最大深度
        int leftMax = maxDepth(root.getLeft());
        int rightMax = maxDepth(root.getRight());
        // 整棵树的最大深度等于左右子树的最大深度取最大值，
        // 然后再加上根节点自己
        int res = Math.max(leftMax, rightMax) + 1;

        return res;
    }
}

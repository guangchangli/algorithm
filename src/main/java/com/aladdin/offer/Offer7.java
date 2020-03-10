package com.aladdin.offer;

/**
 * 输入某二叉树的前序遍历和中序遍历的结果，
 * 请重建该二叉树。
 * 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 * 例如，给出
 * 前序遍历 preorder = [3,9,20,15,7]
 * 中序遍历 inorder = [9,3,15,20,7]
 * 返回如下的二叉树：
 * 3
 * / \
 * 9  20
 * /  \
 * 15   7
 * 限制：
 * 0 <= 节点个数 <= 5000
 *
 * @author lgc
 **/
public class Offer7 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int root = preorder[0];
        //最左
        int lr = preorder[0];
        //最右
        int rr = inorder[inorder.length-1];
        int max = Math.max(preorder.length, inorder.length);
        max-=3;
        //中序根结点idnex
        int rootIndexInOrder=0;
        for (int i = 0; i < inorder.length; i++) {
            if (root!=inorder[i]){
                rootIndexInOrder=i;
            }
        }
        //左子树
        int preLeftIndex=0;
        for (int i = 0; i < preorder.length; i++) {
            if (preorder[i]==inorder[rootIndexInOrder-1]){
                preLeftIndex=i;
            }
        }
        /**
         *  * 前序遍历 preorder = [3,9,20,15,7]
         *  * 中序遍历 inorder = [9,3,15,20,7]
         */
        //遍历左子树
        for (int i = 0; i < rootIndexInOrder; i++) {

        }
return null;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) {
        val = x;
    }
}

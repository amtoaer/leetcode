/*
 * @lc app=leetcode.cn id=110 lang=java
 *
 * [110] 平衡二叉树
 */

// @lc code=start
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    public boolean isBalanced(TreeNode root) {
        if (getDepth(root) == -1) {
            return false;
        }
        return true;
    }

    public int getDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = getDepth(root.left);
        int right = getDepth(root.right);
        // 子树失去平衡，返回-1
        if (left < 0 || right < 0 || Math.abs(left - right) > 1) {
            return -1;
        }
        // 否则返回深度
        return Math.max(getDepth(root.left), getDepth(root.right)) + 1;
    }
}
// @lc code=end

/*
 * @lc app=leetcode.cn id=112 lang=java
 *
 * [112] 路径总和
 */

// @lc code=start
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {
        return judge(root, sum, 0);
    }

    public boolean judge(TreeNode root, int sum, int now) {
        if (root == null) {
            return false;
        }
        if (now + root.val == sum && root.left == null && root.right == null) {
            return true;
        }
        return judge(root.left, sum, now + root.val) || judge(root.right, sum, now + root.val);
    }
}
// @lc code=end

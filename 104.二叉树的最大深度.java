import java.util.Deque;
import java.util.LinkedList;

import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode.cn id=104 lang=java
 *
 * [104] 二叉树的最大深度
 */

// @lc code=start
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int depth = 0;
        TreeNode p;
        Deque<TreeNode> stack = new LinkedList<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            depth++;
            int size = stack.size();
            while (size > 0) {
                p = stack.pop();
                if (p.left != null) {
                    stack.addLast(p.left);
                }
                if (p.right != null) {
                    stack.addLast(p.right);
                }
                size--;
            }
        }
        return depth;

    }
}
// @lc code=end

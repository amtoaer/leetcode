/*
 * @lc app=leetcode.cn id=70 lang=java
 *
 * [70] 爬楼梯
 */

// @lc code=start
class Solution {
    public int climbStairs(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        int a = 1, b = 2;
        int tmp;
        while (n-- > 2) {
            tmp = a;
            a = b;
            b = tmp + a;
        }
        return b;
    }
}
// @lc code=end

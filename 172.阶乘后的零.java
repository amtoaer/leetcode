/*
 * @lc app=leetcode.cn id=172 lang=java
 *
 * [172] 阶乘后的零
 */

// @lc code=start
class Solution {
    public int trailingZeroes(int n) {
        int result = 0;
        while (n / 5 > 0) {
            result += (n / 5);
            n = n / 5;
        }
        return result;
    }
}
// @lc code=end

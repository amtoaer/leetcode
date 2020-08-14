/*
 * @lc app=leetcode.cn id=9 lang=java
 *
 * [9] 回文数
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int count = 0;
        // count为整数位数
        if (x == 0) {
            count = 1;
        } else {
            count = (int) Math.log10(x) + 1;
        }
        count--;
        while (count > 0) {
            if (x / (int) Math.pow(10, count) == x % 10) {
                x = (x % (int) Math.pow(10, count) - x % 10) / 10;
                count -= 2;
            } else {
                return false;
            }
        }
        return true;
    }
}

// @lc code=end

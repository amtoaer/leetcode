/*
 * @lc app=leetcode.cn id=171 lang=java
 *
 * [171] Excel表列序号
 */

// @lc code=start
class Solution {
    public int titleToNumber(String s) {
        int result = 0;
        for (var item : s.toCharArray()) {
            result = result * 26 + item - 'A' + 1;
        }
        return result;
    }
}
// @lc code=end

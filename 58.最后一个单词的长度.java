/*
 * @lc app=leetcode.cn id=58 lang=java
 *
 * [58] 最后一个单词的长度
 */

// @lc code=start
class Solution {
    public int lengthOfLastWord(String s) {
        s = s.stripTrailing();
        int last = s.length() - 1;
        for (int i = last; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                return last - i;
            }
        }
        return s.length();
    }
}
// @lc code=end

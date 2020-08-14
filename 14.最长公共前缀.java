/*
 * @lc app=leetcode.cn id=14 lang=java
 *
 * [14] 最长公共前缀
 */

// @lc code=start
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0 || strs == null) {
            return "";
        }
        int length = strs[0].length();
        for (int i = 0; i < length; i++) {
            char t = strs[0].charAt(i);
            for (int j = 0; j < strs.length; j++) {
                if (i == strs[j].length() || strs[j].charAt(i) != t) {
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0];
    }
}
// @lc code=end

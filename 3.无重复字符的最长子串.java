
/*
 * @lc app=leetcode.cn id=3 lang=java
 *
 * [3] 无重复字符的最长子串
 */

// @lc code=start
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] pos = new int[128];
        for (int i = 0; i < 128; i++) {
            pos[i] = -1;
        }
        int result = 0;
        int start = 0;
        for (int i = 0; i < s.length(); i++) {
            int c = s.charAt(i);
            start = Math.max(start, pos[c] + 1);
            result = Math.max(result, i - start + 1);
            pos[c] = i;
        }
        return result;
    }
}
// @lc code=end

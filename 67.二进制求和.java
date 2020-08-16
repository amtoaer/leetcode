/*
 * @lc app=leetcode.cn id=67 lang=java
 *
 * [67] 二进制求和
 */

// @lc code=start
class Solution {
    public String addBinary(String a, String b) {
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        int length = Math.max(a.length(), b.length());
        for (int i = 0; i < length; i++) {
            int first = i < a.length() ? a.charAt(a.length() - 1 - i) - '0' : 0;
            int last = i < b.length() ? b.charAt(b.length() - 1 - i) - '0' : 0;
            carry = carry + first + last;
            sb.append(carry % 2);
            carry /= 2;
        }
        if (carry != 0) {
            sb.append(carry);
        }
        sb.reverse();
        return sb.toString();
    }
}
// @lc code=end

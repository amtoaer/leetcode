
/*
 * @lc app=leetcode.cn id=38 lang=java
 *
 * [38] 外观数列
 */
import java.lang.StringBuilder;

// @lc code=start
class Solution {
    public String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }
        String tmp = countAndSay(n - 1);
        int flag = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < tmp.length(); i++) {
            if (tmp.charAt(i) != tmp.charAt(flag)) {
                sb.append(i - flag).append(tmp.charAt(flag));
                flag = i;
            }
        }
        sb.append(tmp.length() - flag).append(tmp.charAt(flag));
        return sb.toString();
    }
}
// @lc code=end

import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=53 lang=java
 *
 * [53] 最大子序和
 */

// @lc code=start
class Solution {
    public int maxSubArray(int[] nums) {
        int tmp = 0;
        int sum = Integer.MIN_VALUE;
        for (var item : nums) {
            tmp = Math.max(tmp + item, item);
            sum = Math.max(sum, tmp);
        }
        return sum;
    }
}
// @lc code=end

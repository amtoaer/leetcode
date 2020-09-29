/*
 * @lc app=leetcode.cn id=198 lang=java
 *
 * [198] 打家劫舍
 */

// @lc code=start
class Solution {
    public int rob(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int first = nums[0];
        if (nums.length == 1) {
            return first;
        }
        int second = Math.max(nums[0], nums[1]);
        for (int i = 2; i < nums.length; i++) {
            int tmp = Math.max(first + nums[i], second);
            first = second;
            second = tmp;
        }
        return second;

    }
}
// @lc code=end

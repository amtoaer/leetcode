/*
 * @lc app=leetcode.cn id=26 lang=java
 *
 * [26] 删除排序数组中的重复项
 */

// @lc code=start
class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int num = nums[0], length = 1;
        for (var item : nums) {
            if (item != num) {
                num = item;
                nums[length] = item;
                length++;
            }
        }
        return length;
    }
}
// @lc code=end

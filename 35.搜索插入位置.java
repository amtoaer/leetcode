/*
 * @lc app=leetcode.cn id=35 lang=java
 *
 * [35] 搜索插入位置
 */

// @lc code=start
class Solution {
    public int searchInsert(int[] nums, int target) {
        int result = binarySearch(nums, 0, nums.length - 1, target);
        return result;
    }

    public int binarySearch(int[] nums, int left, int right, int target) {
        if (left > right) {
            return left;
        }
        int middle = left + (right - left) / 2;
        if (nums[middle] == target) {
            return middle;
        } else if (nums[middle] > target) {
            return binarySearch(nums, left, middle - 1, target);
        } else {
            return binarySearch(nums, middle + 1, right, target);
        }
    }
}
// @lc code=end

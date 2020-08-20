/*
 * @lc app=leetcode.cn id=169 lang=java
 *
 * [169] 多数元素
 */

// @lc code=start
class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int tmp = 0;
        for (var item : nums) {
            if (count == 0) {
                tmp = item;
            }
            if (tmp == item) {
                count++;
            } else {
                count--;
            }
        }
        return tmp;
    }
}
// @lc code=end

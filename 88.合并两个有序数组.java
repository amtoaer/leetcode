/*
 * @lc app=leetcode.cn id=88 lang=java
 *
 * [88] 合并两个有序数组
 */

// @lc code=start
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int flag1 = m - 1, flag2 = n - 1, flag3 = m + n - 1;
        while (flag1 >= 0 && flag2 >= 0) {
            if (nums1[flag1] > nums2[flag2]) {
                nums1[flag3] = nums1[flag1];
                flag1--;
            } else {
                nums1[flag3] = nums2[flag2];
                flag2--;
            }
            flag3--;
        }
        System.arraycopy(nums2, 0, nums1, 0, flag2 + 1);
    }
}
// @lc code=end

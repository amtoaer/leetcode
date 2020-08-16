/*
 * @lc app=leetcode.cn id=69 lang=java
 *
 * [69] x 的平方根
 */

// @lc code=start
class Solution {
    public int mySqrt(int x) {
        return binarySearch(0, x, x);
    }

    public int binarySearch(int left, int right, int target) {
        if (left > right) {
            return right;
        }
        int middle = left + (right - left) / 2;
        long tmp = (long) middle * (long) middle;
        if (tmp > target) {
            return binarySearch(left, middle - 1, target);
        } else if (tmp < target) {
            return binarySearch(middle + 1, right, target);
        } else {
            return middle;
        }
    }
}
// @lc code=end

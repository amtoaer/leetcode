/*
 * @lc app=leetcode.cn id=121 lang=java
 *
 * [121] 买卖股票的最佳时机
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int minValue = Integer.MAX_VALUE;
        for (var item : prices) {
            if (item < minValue) {
                minValue = item;
            }
            if (item - minValue > profit) {
                profit = item - minValue;
            }
        }
        return profit;
    }
}
// @lc code=end

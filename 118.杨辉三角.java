import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
 * @lc app=leetcode.cn id=118 lang=java
 *
 * [118] 杨辉三角
 */

// @lc code=start
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            int[] tmp = new int[i + 1];
            tmp[0] = 1;
            tmp[i] = 1;
            if (result.size() >= 1) {
                List<Integer> t = result.get(result.size() - 1);
                for (int j = 1; j < i; j++) {
                    tmp[j] = t.get(j - 1) + t.get(j);
                }
            }
            result.add(Arrays.stream(tmp).boxed().collect(Collectors.toList()));
        }
        return result;
    }
}
// @lc code=end

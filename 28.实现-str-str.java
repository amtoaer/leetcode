/*
 * @lc app=leetcode.cn id=28 lang=java
 *
 * [28] 实现 strStr()
 */

// @lc code=start
class Solution {
  public int strStr(String haystack, String needle) {
    int L = needle.length(), n = haystack.length();
    if (L == 0) {
      return 0;
    }
    int pn = 0;
    while (pn < n - L + 1) {
      // 跳过开头不相同的
      while (pn < n - L + 1 && haystack.charAt(pn) != needle.charAt(0)) {
        pn++;
      }
      ;
      int currLen = 0, pL = 0;
      // 开始处理相同位
      while (pL < L && pn < n && haystack.charAt(pn) == needle.charAt(pL)) {
        // 双指针移位，总长度增加
        pn++;
        pL++;
        currLen++;
      }
      // 如果相同的长度等于需要查找的长度则返回
      if (currLen == L)
        return pn - L;
      // 否则pn回溯
      pn = pn - currLen + 1;
    }
    // 前面未返回，说明未找到，返回-1
    return -1;
  }
}

// @lc code=end

/*
 * @lc app=leetcode.cn id=13 lang=java
 *
 * [13] 罗马数字转整数
 */

// @lc code=start
class Solution {
    public int romanToInt(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'I':
                    if (i == s.length() - 1)
                        result += 1;
                    else {
                        switch (s.charAt(i + 1)) {
                            case 'V':
                                result += 4;
                                i++;
                                break;
                            case 'X':
                                result += 9;
                                i++;
                                break;
                            default:
                                result += 1;
                                break;
                        }
                    }
                    break;
                case 'V':
                    result += 5;
                    break;
                case 'X':
                    if (i == s.length() - 1)
                        result += 10;
                    else {
                        switch (s.charAt(i + 1)) {
                            case 'L':
                                result += 40;
                                i++;
                                break;
                            case 'C':
                                result += 90;
                                i++;
                                break;
                            default:
                                result += 10;
                                break;
                        }
                    }
                    break;
                case 'L':
                    result += 50;
                    break;
                case 'C':
                    if (i == s.length() - 1)
                        result += 100;
                    else {
                        switch (s.charAt(i + 1)) {
                            case 'D':
                                result += 400;
                                i++;
                                break;
                            case 'M':
                                result += 900;
                                i++;
                                break;
                            default:
                                result += 100;
                                break;
                        }
                    }
                    break;
                case 'D':
                    result += 500;
                    break;
                case 'M':
                    result += 1000;
                    break;
            }
        }
        return result;
    }
}
// @lc code=end

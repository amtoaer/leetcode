import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/*
 * @lc app=leetcode.cn id=20 lang=java
 *
 * [20] 有效的括号
 */

// @lc code=start
class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new LinkedList<>();
        for (var item : s.toCharArray()) {
            switch (item) {
                case ']':
                    if (!stack.isEmpty() && stack.peek() == '[') {
                        stack.pop();
                        break;
                    } else {
                        return false;
                    }
                case '}':
                    if (!stack.isEmpty() && stack.peek() == '{') {
                        stack.pop();
                        break;
                    } else {
                        return false;
                    }
                case ')':
                    if (!stack.isEmpty() && stack.peek() == '(') {
                        stack.pop();
                        break;
                    } else {
                        return false;
                    }
                default:
                    stack.push(item);
                    break;
            }
        }
        if (stack.isEmpty()) {
            return true;
        }
        return false;
    }
}
// @lc code=end

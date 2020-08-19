/*
 * @lc app=leetcode.cn id=141 lang=java
 *
 * [141] 环形链表
 */

// @lc code=start
/**
 * Definition for singly-linked list. class ListNode { int val; ListNode next;
 * ListNode(int x) { val = x; next = null; } }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode quick = head;
        while (true) {
            if (quick != null && quick.next != null) {
                quick = quick.next.next;
                slow = slow.next;
            } else {
                return false;
            }
            if (slow.equals(quick)) {
                return true;
            }
        }
    }
}
// @lc code=end

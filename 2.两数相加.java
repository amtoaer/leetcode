/*
 * @lc app=leetcode.cn id=2 lang=java
 *
 * [2] 两数相加
 */
// @lc code=start
/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode root = new ListNode(0);
        ListNode now = root;
        int carry = 0;
        int aval, bval, tmp;
        while (l1 != null || l2 != null || carry != 0) {
            aval = l1 == null ? 0 : l1.val;
            bval = l2 == null ? 0 : l2.val;
            l1 = l1 == null ? l1 : l1.next;
            l2 = l2 == null ? l2 : l2.next;
            tmp = aval + bval + carry;
            now.next = new ListNode(tmp % 10);
            now = now.next;
            carry = tmp / 10;
        }
        return root.next;
    }
}
// @lc code=end

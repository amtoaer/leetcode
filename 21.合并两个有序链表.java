/*
 * @lc app=leetcode.cn id=21 lang=java
 *
 * [21] 合并两个有序链表
 */

// @lc code=start
/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode() {} ListNode(int val) { this.val = val; } ListNode(int val,
 * ListNode next) { this.val = val; this.next = next; } }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode root = new ListNode();
        ListNode cur = root;
        ListNode tmp;
        while (l1 != null && l2 != null) {
            if (l1.val >= l2.val) {
                tmp = new ListNode(l2.val);
                cur.next = tmp;
                cur = cur.next;
                l2 = l2.next;
            } else {
                tmp = new ListNode(l1.val);
                cur.next = tmp;
                cur = cur.next;
                l1 = l1.next;
            }
        }
        cur.next = l1 == null ? l2 : l1;
        return root.next;
    }
}
// @lc code=end

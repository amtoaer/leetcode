/*
 * @lc app=leetcode.cn id=83 lang=java
 *
 * [83] 删除排序链表中的重复元素
 */

// @lc code=start
/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode i = head;
        ListNode j = head;
        while (j != null) {
            if (j.val != i.val) {
                i.next = j;
                i = i.next;
            }
            j = j.next;
        }
        i.next = null;
        return head;
    }
}
// @lc code=end

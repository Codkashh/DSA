/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }

        ListNode newNode = new ListNode(0);
        newNode.next = head;
        ListNode temp = newNode;

        while(temp.next != null && temp.next.next != null) {
            if(temp.next.val == temp.next.next.val) {
                int copy = temp.next.val;
                while(temp.next != null && temp.next.val == copy) {
                    temp.next = temp.next.next;
                }
            }
            else {
                temp = temp.next;
            }
        }
        return newNode.next;
    }
}
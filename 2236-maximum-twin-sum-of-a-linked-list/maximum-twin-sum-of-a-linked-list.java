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
    public ListNode reverse(ListNode head) {
        ListNode current = head;
        ListNode previous = null;
        ListNode after = null;
        while(current!=null){
            after = current.next;
            current.next = previous;
            previous = current;
            current = after;
        }
        return previous;
    }
    public int pairSum(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!=null && fast.next.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode temp = reverse(slow.next);
        slow.next = temp;
        int maxSum = 0;
        ListNode p1 = head;
        ListNode p2 = slow.next;
        while(p2!=null) {
            int sum = p1.val + p2.val;
            if(sum>maxSum){
                maxSum = sum;
            }
            p1 = p1.next;
            p2 = p2.next;
        }
        return maxSum;
    }
}
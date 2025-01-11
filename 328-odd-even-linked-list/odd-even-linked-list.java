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
    public ListNode oddEvenList(ListNode head) {
        ListNode odd = new ListNode(0);
        ListNode even = new ListNode(0);
        ListNode tempEven = even;
        ListNode tempOdd = odd;
        ListNode temp = head;
        while(temp!=null){
            tempOdd.next = temp;
            temp = temp.next;
            tempOdd = tempOdd.next;

            tempEven.next = temp;
            if(temp == null) break;
            temp = temp.next;
            tempEven = tempEven.next;
        }
        odd = odd.next;
        even = even.next;
        tempOdd.next = even;
        return odd; 
    }
}
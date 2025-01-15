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
    public ListNode middleOfLL(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!=null && fast.next.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp1 = list1;
        ListNode temp2 = list2;
        ListNode temp = new ListNode(100);
        ListNode head = temp;
        while(temp1!=null && temp2!=null){
            if(temp1.val<temp2.val){
                temp.next = temp1;
                temp = temp1;
                temp1 = temp1.next;
            } else{
                temp.next = temp2;
                temp = temp2;
                temp2 = temp2.next;
            }
        }
        if(temp1 == null){
            temp.next = temp2;
        } else{
            temp.next = temp1;
        }
        return head.next;
    }

    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        //to find middle of LL
        ListNode middle = middleOfLL(head);
        
        // dividing LL in two parts--
        ListNode right = middle.next; 
        middle.next = null;
        ListNode left = head;

        //now sorting both the LL--
        left = sortList(left);
        right = sortList(right);

        // now merge both the LL--

        return mergeTwoLists(left, right);
    }
}
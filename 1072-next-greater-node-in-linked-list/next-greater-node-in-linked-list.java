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
    public int[] nextLargerNodes(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();

        ListNode dummy = head;

        while(dummy != null) {
            ListNode L = dummy.next;
            while(L != null && L.val <= dummy.val) {
                L = L.next;
            }
            if (L == null)
                list.add(0);
            else
                list.add(L.val);
            
            dummy = dummy.next;
        }

        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }
}
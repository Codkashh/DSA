/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Map<Node, Node> hashMap = new HashMap<>();

        Node temp = head;

        while(temp!=null){
            hashMap.put(temp, new Node(temp.val));
            temp = temp.next;
        }

        temp = head;

        while(temp != null){
            Node copy = hashMap.get(temp);
            copy.next = hashMap.get(temp.next);
            copy.random = hashMap.get(temp.random);
            temp = temp.next;
        }

        return hashMap.get(head);
    }
}
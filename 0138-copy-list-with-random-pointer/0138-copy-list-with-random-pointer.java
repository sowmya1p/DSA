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
        Node temp=head;
        LinkedHashMap<Node,Node> hm=new LinkedHashMap<>();
        while(temp!=null){
           Node newNode=new Node(temp.val);
           hm.put(temp,newNode);
           temp=temp.next;
        }
        temp=head;
        while(temp!=null){
            Node copyNode=hm.get(temp);
            copyNode.next=hm.get(temp.next);
            copyNode.random=hm.get(temp.random);
            temp=temp.next;

        }
        return hm.get(head); 
    }
}
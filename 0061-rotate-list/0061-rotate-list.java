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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null||head.next==null){
            return head;
        }
        int count=0;
        ListNode temp=head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        k=k%count;
        ListNode rotatedList=head;
        for(int i=0;i<k;i++){
            rotatedList=rotate(rotatedList,null,rotatedList);
        }
        return rotatedList;
    }
    public ListNode rotate(ListNode head,ListNode prev,ListNode curr){
         if (curr.next == null) {
            if (prev != null) prev.next = null; // cut last
            curr.next = head; // attach current last to front
            return curr; // new head
        }
        return rotate(head,curr, curr.next);
    }
}
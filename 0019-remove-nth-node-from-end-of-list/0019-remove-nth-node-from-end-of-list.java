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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        int count=0;
        ListNode temp=head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        if(n==1&&count==1){
            return null;
        }
        int val=count-n;
        int count1=0;
        ListNode temp1=head;
       // ListNode prev=temp1;
        while(temp1!=null){
            count1++;
            if(val==count1){
                break;
            }
            temp1=temp1.next;
        }
        ListNode prev=temp1;
        prev.next=prev.next.next;
        return head;
        
    }
}
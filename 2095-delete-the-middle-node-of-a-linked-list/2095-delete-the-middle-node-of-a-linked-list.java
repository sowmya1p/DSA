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
    public ListNode deleteMiddle(ListNode head) {
        int count=0;
        ListNode temp=head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        int val=count/2;
        if(count==1){
            return null;
        }
        if(count==2||count==3){
            ListNode temps=head;
            temps.next=temps.next.next;
            return head;
        }
        int count1=1;
        ListNode temp1=head;
        while(temp1!=null){
            count1++;
            temp1=temp1.next;
            if(count1==val){
                break;
            }
            //temp1=temp1.next;
          //  count1++;
        }
        temp1.next=temp1.next.next;
        return head;

    }
}
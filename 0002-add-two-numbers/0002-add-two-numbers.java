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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode add=new ListNode(-1);
        ListNode temp=add;
       // int sum=0;
        int carry=0;
        ListNode temp1=l1;
        ListNode temp2=l2;
        while(temp1!=null||temp2!=null){
             int sum=carry;
             if(temp1!=null){
                 sum+=temp1.val;
                 temp1=temp1.next;
             }
             if(temp2!=null){
                sum+=temp2.val;
                temp2=temp2.next;
             }
             if(sum<10){
                 temp.next=new ListNode(sum);
                 carry=0;
             }
             
             else if(sum>=10){
                carry=sum/10;
                temp.next=new ListNode(sum%10);
             }
             
             temp=temp.next;
            //  add=add.next;
        }
        if(carry!=0){
            temp.next=new ListNode(carry);
        }
        return add.next;
    }
}
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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp=head;
        ListNode previousNode=null;
        while(temp!=null){
            ListNode findKthNode=find(temp,k);
            if(findKthNode==null){
                if(previousNode!=null){
                    previousNode.next=temp;
                }
               
                break;
            }
            ListNode nextNode=findKthNode.next;
            //ListNode previousNode=null;
            findKthNode.next=null;
            reverse(temp);
            if(temp==head){
                head=findKthNode;
            }
            else{
                 previousNode.next=findKthNode;
            }
            previousNode=temp;
            temp=nextNode;
        }
        return head;

    }
    public static ListNode find(ListNode head,int k){
           ListNode temp=head;
           while(k>1&&temp!=null){
            temp=temp.next;
            k--;
           }
           return temp;
    }
    public static ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null){
            ListNode nextNode=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextNode;
        }
        return prev;
    }
}
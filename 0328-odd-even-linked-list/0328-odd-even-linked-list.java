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
        if(head==null){
            return null;
        }
        ListNode h1=new ListNode(-1);
        ListNode h2=new ListNode(-1);
        ListNode t1=head;
        ListNode t2=head.next;
        ListNode tt1=h1;
        tt1.next=new ListNode(t1.val);
        tt1=tt1.next;
        ListNode tt2=h2;
        tt2.next=new ListNode(t2.val);
        tt2=tt2.next;
        while(t1.next!=null&&t1.next.next!=null){
            tt1.next=new ListNode(t1.next.next.val);
            tt1=tt1.next;
            t1=t1.next.next;
        }
        while(t2.next!=null&&t2.next.next!=null){
            tt2.next=new ListNode(t2.next.next.val);
            tt2=tt2.next;
            t2=t2.next.next;
        }
        ListNode temp=h1.next;
        while(temp.next!=null){
           temp=temp.next;
        }
        temp.next=h2.next;
        return h1.next;
    }
}
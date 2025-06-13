/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempA=headA;
        ListNode tempB=headB;
        int countA=0;
        int countB=0;
        while(tempA!=null){
            countA++;
            tempA=tempA.next;
        }
        while(tempB!=null){
            countB++;
            tempB=tempB.next;
        }
        int diff=Math.abs(countA-countB);
        ListNode temp1=headA;
        ListNode temp2=headB;
        int val=0;
        if(countA>countB){
             while(diff>0){
                temp1=temp1.next;
                diff--;
             }
        }
        else if(countA<countB){
             while(diff>0){
                temp2=temp2.next;
                diff--;
             }
        }
        while(temp1!=null&&temp2!=null){
            if(temp1==temp2){
                return temp1;
            }
            temp1=temp1.next;
            temp2=temp2.next;
        }
        return null;
           }
}
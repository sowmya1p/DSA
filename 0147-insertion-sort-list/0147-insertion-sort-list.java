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
    public ListNode insertionSortList(ListNode head) {
        ListNode temp=head;
        int count=0;
        while(temp!=null){
         count++;
         temp=temp.next;
        }
        int arr[]=new int[count];
        int s=0;
        ListNode temp1=head;
        while(temp1!=null){
            arr[s]=temp1.val;
            s++;
            temp1=temp1.next;
        }
        for(int i=0;i<count;i++){
            int j=i;
            while(j>0&&arr[j-1]>arr[j]){
                int temps=arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temps;
                j--;
            }
        }
        ListNode dummy=new ListNode(0);
        ListNode temp3=dummy;
        for(int k=0;k<count;k++){
            temp3.next=new ListNode(arr[k]);
            temp3=temp3.next;
        }
        return dummy.next;
    }
}
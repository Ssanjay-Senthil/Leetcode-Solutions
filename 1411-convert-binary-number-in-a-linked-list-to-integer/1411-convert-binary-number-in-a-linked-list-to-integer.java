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
    public int getDecimalValue(ListNode head) {
        int len=-1;
        int ans=0;
        ListNode temp=head;
        while(temp!=null){
            temp=temp.next;
            len++;
        }
        System.out.print(len);
        while(len!=-1){
            ans+=((head.val)*(int)Math.pow(2,len--));
            head=head.next;
        }
        return ans;
    }
}
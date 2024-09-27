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
    public ListNode middleNode(ListNode head) {
        ListNode temp = head;
        int n=0;
        while(temp!=null){
            temp = temp.next;
            n++;
        }
        int middle = n/2;
        for(int i=0;i<middle;i++){
            head=head.next;
        }
        return head;
    }
}
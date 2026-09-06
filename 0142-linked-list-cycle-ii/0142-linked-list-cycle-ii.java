/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
         if(head == null || head.next == null)
         return null;

         ListNode slow = head;
         ListNode  Fast = head;

         while( Fast != null && Fast.next != null) {
        slow = slow.next;
        Fast = Fast.next.next;
                

         if ( slow == Fast){
             slow = head;
         
        while(slow != Fast)
        {
            slow = slow.next;
            Fast = Fast.next;

        }
          return slow;
         }
     }
       return null;
    }
}
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
        if(head == null) return null;
        HashSet<ListNode> map=new HashSet<>();
        ListNode temp=head;
        while(temp.next != null){
            if(map.contains(temp)){
                    return temp;
            }
            map.add(temp);
            temp=temp.next;
        }
     temp=null;
     return temp;
    }
}
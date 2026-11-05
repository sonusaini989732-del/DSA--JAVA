public class Solution {
    public boolean hasCycle(ListNode head) {
     ListNode prev=head;
     ListNode first=head;
     while(first!=null && first.next!=null){
         prev=prev.next;
         first=first.next.next;
            if(prev==first){
            return true;
            }
    }
    return false;
}
}
package DSA.remove_loop_in_linked_list;


class Node
{
    int data;
    Node next;
}


class Solution
{
    //Function to remove a loop in the linked list.
    public static void removeLoop(Node head){
        // code here
        if (head == null || head.next == null)
            return;
        Node fast=head;
        Node slow=head;
        slow = slow.next;
        fast = fast.next.next;
        while(fast!=null && fast.next!=null){
            if(fast==slow){
                break;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        if (slow == fast) {
            slow = head;
            if (slow != fast) {
                while (slow.next != fast.next) {
                    slow = slow.next;
                    fast = fast.next;
                }
                fast.next = null;
            }
            else {
                while(fast.next != slow) {
                    fast = fast.next;
                }
                fast.next = null;
            }
        }
    }

}

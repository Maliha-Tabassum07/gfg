package DSA.check_if_linked_list_is_palindrome;

class Node
{
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}


class Solution
{
    //Function to check whether the list is palindrome.
    boolean isPalindrome(Node head)
    {
        Node slow=head, fast=head;
        if(head==null|| head.next==null) return true;
        while ( fast.next!=null && fast.next.next!=null){
            slow =slow.next;
            fast =fast.next.next;
        }
        Node tempHead=reverseList(slow.next);
        Node left=head;
        Node right=tempHead;
        while(right!=null){
            if(left.data!=right.data){
                reverseList(tempHead);
                return false;
            }
            left=left.next;
            right=right.next;
        }
        reverseList(tempHead);
        return true;

    }

    Node reverseList(Node head){
        Node prev=null;
        Node current=head;
        Node next=null;
        while(current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        head=prev;
        return head;
    }

}

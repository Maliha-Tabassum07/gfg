package DSA.reverse_a_linked_list;

class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
    }
}
class Solution
{
    //Function to reverse a linked list.
    Node reverseList(Node head)
    {

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
        // for(Node n=head.next;n.next!=null;n=prev){
        //     prev=n.next;
        //     n.next=head;
        //     head=n;
        // }
        // return head;
    }
}


package DSA.remove_duplicate_element_from_sorted_linked_list;


class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }


class GfG
{
    //Function to remove duplicates from sorted linked list.
    Node removeDuplicates(Node head)
    {
        if(head==null||head.next==null){
            return head;
        }
        Node prev=head;
        for(Node n=head.next;n!=null;n=n.next){
            if(prev.data==n.data){
                if(prev==head){
                    head=n;
                    prev=n;
                }
                else if(n.next!=null){
                    prev.next=n.next;
                }
                else{
                    prev.next=null;
                }
            }
            else{
                prev=n;
            }
        }
        return head;
    }
}

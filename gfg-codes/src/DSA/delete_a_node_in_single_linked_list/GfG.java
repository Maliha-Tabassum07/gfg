package DSA.delete_a_node_in_single_linked_list;

class GfG
{
    Node deleteNode(Node head, int x)
    {
        if(x==1){
            head=head.next;
            return head;
        }
        int count=1;
        for(Node n=head;n!=null;n=n.next){
            if(count==x-1){
                n.next=n.next.next;
                return head;
            }
            count++;
        }
        return head;
    }
}
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

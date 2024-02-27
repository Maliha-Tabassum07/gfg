package DSA.check_if_circular_linked_list;

class GfG
{
    boolean isCircular(Node head)
    {
        for(Node n=head; n.next!=null;n=n.next){
            if(n.next==head){
                return true;
            }
        }
        return false;
    }
}

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
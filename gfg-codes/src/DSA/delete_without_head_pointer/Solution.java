package DSA.delete_without_head_pointer;


class Node
{
    int data ;
    Node next;
    Node(int d)
    {
        data = d;
        next = null;
    }
}
class Solution
{
    void deleteNode(Node del_node)
    {
        if(del_node.next==null){
            del_node=null;
        }
        else{
            del_node.data=del_node.next.data;
            del_node.next=del_node.next.next;
        }
    }
}

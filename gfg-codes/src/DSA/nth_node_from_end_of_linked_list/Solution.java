package DSA.nth_node_from_end_of_linked_list;

class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}

class Solution
{
    //Function to find the data of nth node from the end of a linked list.
    int getNthFromLast(Node head, int n)
    {
        int total=0;
        int count=0;
        for(Node node=head;node!=null;node=node.next){
            total++;
        }
        for(Node node=head;node!=null;node=node.next){
            if(count==total-n){
                return node.data;
            }
            count++;
        }
        return -1;
    }
}


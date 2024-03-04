package DSA.count_nodes_of_linked_list;

class Solution
{
    //Function to count nodes of a linked list.
    public static int getCount(Node head)
    {

        int count=0;
        for(Node n= head;n!=null;n=n.next){
            count++;
        }
        return count;
    }
}
class Node{
    int data;
    Node next;
    Node(int a){  data = a; next = null; }
}

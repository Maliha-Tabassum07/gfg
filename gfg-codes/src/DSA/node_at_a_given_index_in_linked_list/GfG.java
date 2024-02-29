package DSA.node_at_a_given_index_in_linked_list;


class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}
class GfG
{

    public static int getNth(Node node, int ind)
    {
        int count=1;
        for(Node n=node;n!=null;n=n.next){
            if(count==ind){
                return n.data;
            }
            count++;
        }
        return -1;
    }
}

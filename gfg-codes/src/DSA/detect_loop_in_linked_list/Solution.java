package DSA.detect_loop_in_linked_list;

class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}

class Solution {
    //Function to check if the linked list has a loop.
    public static boolean detectLoop(Node head){
        // ArrayList<Node> nodeList=new ArrayList<>();
        // for(Node n=head;n!=null;n=n.next){
        //     if(nodeList.contains(n)){
        //         return true;
        //     }
        //     nodeList.add(n);
        // }
        // return false;
        Node fast=head;
        Node slow=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                return true;
            }
        }
        return false;
    }
}

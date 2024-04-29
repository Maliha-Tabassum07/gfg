package DSA.finding_middle_element_in_a_linked_list;

class Node {
    int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}


class Solution
{
    int getMiddle(Node head)
    {
//        int totalIndex=0;
//        for(Node n=head;n!=null;n=n.next){
//            totalIndex++;
//        }
//        int middleIndex=(totalIndex/2);
//        totalIndex=0;
//        for(Node n=head;n!=null;n=n.next){
//            if(totalIndex==middleIndex){
//                return n.data;
//            }
//            totalIndex++;
//        }
//        return -1;
        Node fast=head, slow=head;
        while (fast !=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow.data;
    }
}


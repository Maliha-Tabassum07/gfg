package DSA.remove_duplicates_from_an_unsorted_linked_list;

import java.util.HashSet;

class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}

class Solution
{
    //Function to remove duplicates from unsorted linked list.
    public Node removeDuplicates(Node head)
    {
        if(head==null||head.next==null){
            return head;
        }
        HashSet<Integer> count=new HashSet<Integer>();
        Node prev=head;
        count.add(prev.data);
        for(Node n=head.next;n!=null;n=n.next){
            if(count.contains(n.data)){
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
                count.add(n.data);
                prev=n;
            }
        }
        return head;
        // count.add(head.data);
        // for(Node n=head;n.next!=null;n=n.next){
        //     if(count.contains(n.next.data)){
        //         if(n.next.next!=null){
        //             n.next=n.next.next;
        //         }
        //         else{
        //             n.next=null;
        //         }
        //     }
        //     else{
        //         count.add(n.next.data);
        //     }
        // }
        // return head;
    }
}


public class Main {
    public static void main(String[] args) {
        // so this time we have to make stack using linked list okkay
    }

}
// i can do it if i can do it with array
// by using the ds ll


// list node //
/*
class ListNode {        // rep the entire ll
    Node head = null;   // u need this guy alway
    Node pointer = null;       // to move forward in ll


    class Node{                 // rep only one node of ll
        int data;
        Node next = null;       // to store the next

        Node(int val){
            this.data = val;
        }
        Node(int val, Node nex) {
            this.data = val;
            this.next = nex;
        }
    }

    void add(int val){
       if(this.head == null){
           this.head = new Node(val);
           this.pointer = this.head;      // means right now pointer on head
       }
       else {
           this.pointer.next = new Node(val);        // giving pointer.next a new node (with value and store address on the pointer.next
           this.pointer = this.pointer.next;              // moving pointer to next point
       }
    }

    void remove(){
        if(this.head == null) System.out.println("nothing to remove");
        else {
            this.pointer = null;
        }
    }

}
*/
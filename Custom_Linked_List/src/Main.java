
class LodaLassan{
    Node head;
    class Node{
        // each object of class node must have only 2 shit ^ (i) data (that u can specify the type
        // ^ (ii) location to next node as we know our node itself is a reference type means you get the address of node if u try to save it in a variable

        int data;
        Node next = null;          // next have the new node address (seems like next stores the Node itslf but we all know referrance type stores the address onlu)

        // now think
        Node(int val){
            this.data = val;
        }
    }

    // creating a print ll method
    void printll(){
        Node n = head;
        // starting from head but don't use head use its copy
        while (n != null){
            System.out.println(n.data);
            n = n.next;
        }
    }

    // making add method is harsh right now // yaa but i will do it later #todo
}


public class Main {
    public static void main(String[] args) {

        // lets make my custom singly linked list to better understand it excited
        // first i'll make node Class inside the class
        // why to make node class (node represents our object the object we have to deal with)

        // IMP - we have to keep track of head



        LodaLassan myLodaList = new LodaLassan();       // this is my new loda list

            //i need to create the first node
            LodaLassan.Node node1 =  myLodaList.new Node(10);    // look the first one and this they are exactly same as making a new instance of some class
            // wtf why this new Node is not creating without the constructor even after that it gives error wtf i think i am missing something lets ask chat gpt
            // well actually i am making classed inside my main fuction and that is fking weird

        myLodaList.head = node1;           // gonna use it as starting point


        // lets make node 2
        LodaLassan.Node node2 = myLodaList.new Node(20);        // new node is created and it must have an address lets assign it to node 1
        node1.next = node2;

        // lets make the node 3
        LodaLassan.Node node3 = myLodaList.new Node(30);
        node2.next = node3;

        myLodaList.printll();

    }
}
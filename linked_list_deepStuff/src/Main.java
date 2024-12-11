public class Main {
    public static void main(String[] args) {

        LundList lund = new LundList();
        lund.add(11);
        lund.add(22);
        lund.add(123);
        lund.printMyLoda();
        System.out.println("the size of the list is: " + lund.size());

        lund.get(3);

    }
}


class LundList {
    Node head = null;                                    // we have to keep track of the head node so making a variable for that also making it null initially so that by the help of conditional i could make the first one the head node
    Node tempPointer;          // its required for the tracking a pointer for us making it inside method will fuck up the entire implementation when that method more that one times

    class Node {
        int data;
        Node next;

        // constructor
        Node(int val) {
            this.data = val;
            this.next = null;
        }
    }

    // ---------------------------------- * the add method * ------------------------------------------------//

    void add(int item) {
        if (head == null) {
            tempPointer = new Node(item);
            head = tempPointer;
        } else {                                            // now to link the other ones to the head if there is a head || for this we'll use a temporary tracker noobs call it tail wtf i don't care
            tempPointer.next = new Node(item);
            tempPointer = tempPointer.next;                                   // that's how we update the tail
        }
    }

    // ------------------------------------ * the print method * ----------------------------------------------//

    void printMyLoda(){
        // again we use the head to track all the fuckers //
        Node it = this.head;
        if(it == null){
            System.err.println("fkk the list have nothing to show its fking empty");
            return;
        }
        while(it != null){
            System.out.println(it.data);
            it = it.next;
        }
    }

    // ------------------------------------------ * the peek method * -----------------------------------------//

    void peek(){
        // for each thing we gonna use head or some other pointer got ya //
        if(head == null) System.err.println("not found as the list is empty");
        else System.out.println(head.data);
    }

    // ------------------------------------------- * get count * ----------------------------------------------//

     int size(){
        // to get the size we have to iterate through the list by using the while loop till the next node is null or not present got yaa //
        int cout = 0;
        Node it = this.head; // everytime make an it that is equals to head ok
        while(it != null){
            cout++;
            it = it.next;
        }
        return cout;
    }

    // -------------------------------------------- * get at index * ------------------------------------------//
    // at that shit linked list is pretty bad as it have to iterate through the stuff idk maybe

    void get(int index){
        int count = 0;
        Node it = this.head;     // it all starts with a copy of head // ;)
        while(count <= index){
            if(it == null) {
                System.err.println("list index out of bound");
                return;
            }
            else {
                it = it.next;
                count++;
            }
        }
        System.out.println(it.data);
    }
}
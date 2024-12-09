import java.util.*;

public class Main {
    public static void main(String[] args) {

        // lets make an instance of linked list first

        LinkedList<String> ll = new LinkedList<>();
        ll.add("hello");
        ll.add("how");
        ll.add("momentum");
        ll.add("motivation");

        System.out.println(ll);

        // size method
        System.out.println(ll.size());

        // get method
        System.out.println(ll.get(3));

        // add method   (i) the without index add ele at tail
                        // (ii) the without index will make it place without removing anyone just ghuse jata hai

        ll.add("priorities");
        ll.add(2, "is");
        ll.add(3, "yours");


        System.out.println(ll);
                        // what if i add at some non availabe index away from tail
//        ll.add(10, "cracked");        simpley index out of bound error


        // merging a collection into other (can i do it with like list collection's kids mix like linked list, arrayList , vector

        ArrayList<String> hola = new ArrayList<>();
        hola.add("fuck");
        hola.add("this");
        hola.add("world");

        ll.addAll(hola);

        System.out.println(ll);


        // remove
        ll.removeFirst();
        ll.removeLast();
        ll.remove(5);

        System.out.println(ll);

        // remove all method //

        ll.removeAll(hola);
        System.out.println(ll);

        Iterator<String> mango =  ll.descendingIterator();
        while (mango.hasNext()){
            System.out.println(mango.next());
        }

        Collections.sort(ll);
        System.out.println(ll);
    }
}
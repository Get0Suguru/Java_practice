import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        // as we know arrayList sucks at shifting and deletion
        // linked list sucks at searching

        // lets make a program that will do get the time taken so that we could prove our theory

        // noted - the difference is only visible for large data sets as computers are preety fast


        ArrayList<Integer> aalu = new ArrayList<Integer>();
        LinkedList<Integer> lola = new LinkedList<>();

        // adding elements to arrayList

        for (int i = 0; i < 1000000; i++) {                 // a million have six zeroes
            aalu.add(i, i);
            lola.add(i);
        }

        // storing and getting the time
        long startTime;
        long endTime;
        long timeTaken;

        // for searching and for insertion and deletion

        // ************* Array List *****************
        startTime = System.nanoTime();
        // do something
//        aalu.get(0);              something in the start
//        aalu.get(500000);         something in the middle
//        aalu.get(999999);         something at the end

//        aalu.add(0, 19);          hell alot of shifting he looses
//        aalu.add(999999,19);      close as there is pretty less shifting of indexes

        endTime = System.nanoTime();
        timeTaken = endTime - startTime;
        System.out.println("Array list time taken is: " + timeTaken);

        // ************ Linked List ***************
        startTime = System.nanoTime();
        // do something
//        lola.get(0);
//        lola.get(500000);           something in the middle as obvious array wins
//        lola. get(999999);            something at the end pretty close as the linked list is doubly if its singly it gonna take alot time

//        lola.add(0, 19);          pretty ezzy win as he have to just add a node
//        lola.add(999999, 19);     just another node doesn't matter for him

        endTime = System.nanoTime();
        timeTaken = endTime - startTime;
        System.out.println("Linked list time taken is: " + timeTaken);







    }
}
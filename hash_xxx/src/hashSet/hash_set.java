package hashSet;

import java.util.HashSet;
import java.util.Iterator;

public class hash_set {
    public static void main(String[] args) {
        HashSet<String> happy = new HashSet<String>();

        happy.add("papa");
        happy.add("chacha");
        happy.add("nana");
        happy.add("mama");
        happy.add("kaka");
        happy.add("lola");

        Iterator<String> lola = happy.iterator();
        while(lola.hasNext()){                                  // use iterator.hasNext() to check
            System.out.println(lola.next());                    // use iterator.next() to get the next value
        }
    }
}

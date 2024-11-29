import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        // 1. lets make a new instance of queue

        Queue<String> fqu = new LinkedList<String>() {
        };

        // 2. lets add some shit to my queue (i know its circular and first in first out concept based)
        fqu.add("grandParents");
        fqu.add("parents");
        fqu.add("kids");
        fqu.offer("dick");

        //3. lets try to print queue
        System.out.println(fqu);

        //4. to remove a data from queue we use poll (not pop)
        System.out.println(fqu.poll());     // order of death firstborn first to death //

        //5. peak will give u the upper one (in that case it will be the parents now) if stack it will be kids
        System.out.println(fqu.peek());


        fqu.add("sperm");
        //6. you can convert a queue into an array using the .toArray() method
        var faimly = fqu.toArray();
        for (Object x: faimly){
            System.out.println(x);
        }

    }
}
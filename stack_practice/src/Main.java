import java.util.Objects;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        // lets make a new instance of stack

        Stack<String> gamesDvd = new Stack<String>();

        // 1. adding data to our stack
        gamesDvd.add("valorant");
        gamesDvd.add("mirror edge");
        gamesDvd.add("getting over it");
        gamesDvd.add("igi 2");

        // 2. lets print the stack
        System.out.println(gamesDvd);
        // it will print in opposite order actually on top its igi 2

        // 3. pop some data

        System.out.println(gamesDvd.pop());         // it'll remove the upper one (the first one from vertical tower)-> igi 2
        System.out.println(gamesDvd);

        // 4. peak -> peak refers to the uppest one stored in the stack

        System.out.println(gamesDvd.peek());        //now getting over it is on peak after the igi

        // 5. contains or not

        System.out.println(gamesDvd.contains("mirror edge"));

        // 6. empty() - gives boolean whether the stack is empty or not
        System.out.println(gamesDvd.empty());

        // 7. get something at some index (read) or set something (write) by index
                //maybe under the hood we pop to reach some obj idk bro said u must have to pop to access lower shit in the tower
                // put igi 2 on no 1 and remove the getting over it and remove valorant and put freedom fighter

        gamesDvd.set(0, "igi 2");
        if(Objects.equals(gamesDvd.get(1), "mirror edge")){
            System.out.println("nice ");
        }
        else System.out.println("not nice ");

        gamesDvd.set(2, "freedom fighter");

        System.out.println(gamesDvd);

        // searching in stack

        System.out.println(gamesDvd.search("igi 2"));       // searching no are given from top of the stack (vertical tower)
        // means search or accessing goes from top to bottom got it
    }
}
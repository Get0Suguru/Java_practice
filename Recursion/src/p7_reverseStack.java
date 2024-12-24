import java.util.Iterator;
import java.util.Stack;

public class p7_reverseStack {


    public static void main(String[] args) {
        Stack<Integer> moye = new Stack<>();
        moye.push(2);
        moye.push(4);
        moye.push(6);
        moye.push(8);
        moye.push(10);
        moye.push(100);

        // i am gonna put an element below the 2 wihout using other data set
        reverse(moye);

        Iterator<Integer> it = moye.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
            // it'll print 100, 10, 8, 6, 4, 2, 1
        }

    }


    public static void reverse(Stack<Integer> moyemoye) {
            if(moyemoye.isEmpty()) return;

        // induction
        int poped = moyemoye.pop();             // thing u did dec the input        // again i have to make a new variable to store ok coz they can't make value in outer dec varible go back
        reverse(moyemoye);                      // trust the hypothisis
        insert(moyemoye,poped);                 // putting things back after the hypothsis on smaller i/p
    }


    // i am building and checking the insert function first ok
    public static void insert(Stack<Integer> smack, int insertAtFirst){
        // base case
        if(smack.isEmpty()) {smack.push(insertAtFirst);            // stopping at last element coz we apparetly gonna pop it out the empty one throught the rror coz of popiing out of emptu
            return;}
        // induction
        // making a new element here is hell imp else the last got saved is gonna get repeated in the results
        int temp = smack.pop();
        insert(smack,insertAtFirst);                                // our hyp this is this will put it at first and for smalling ip we pop push is back
        smack.push(temp);
    }
}

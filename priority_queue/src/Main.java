import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {


        // lets make a priority queue and have saxsux with him

        Queue<Double> fuckq = new PriorityQueue<Double>(Collections.reverseOrder());               // for priority queue make object of Priority Queue class


        fuckq.offer(5.0);
        fuckq.offer(7.0);
        fuckq.offer(10.0);
        fuckq.offer(1.0);
        fuckq.offer(3.0);

//        System.out.println(fuckq);                  //while printing queue nashe on i can't fig out the order of printing or like priority
                                                     // but that's not the case with poll(dequeue)(or type of serving)  normally lower the value have higher the priority
        while(!fuckq.isEmpty()){
            System.out.println(fuckq.poll());
        }

        // to reverse the order of serving pass the comparator in class



        // in case of String it server based on alphabetic order (A have high priority and Z have least)

    }
}
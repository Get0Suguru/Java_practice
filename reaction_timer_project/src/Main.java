import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("3");
        // to make the program pause for some time we use
        Thread.sleep(1000);
        System.out.println("2");
        Thread.sleep(1000);
        System.out.println("1");
        Thread.sleep(1000);
        System.out.println("GO !!!!");

        long startTime = System.currentTimeMillis();
        Scanner hepMe = new Scanner(System.in);
        hepMe.next();
        long endTime = System.currentTimeMillis();
        System.out.println("Reaction Time: " + (endTime - startTime) + " ms");


    }
}
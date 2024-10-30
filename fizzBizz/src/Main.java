import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner hepMe = new Scanner(System.in);

        int x = hepMe.nextInt();

        if (x % 5 == 0) {
            if (x % 3 == 0)
                System.out.println("FizzBuzz");
            else System.out.println("Fizz");
            
        } else if (x % 3 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(x);
        }
    }
}
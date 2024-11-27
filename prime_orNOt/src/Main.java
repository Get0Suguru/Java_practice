import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Hey, I am the prime no. checker \n\nplease enter a no: ");

        // can't fig out how to track the result => make a vaiable of boolean ezzy pezzy

        boolean isPrime = true;
        Scanner hepMe = new Scanner(System.in);
        int userInput = hepMe.nextInt();

        for(int i = 2; i< userInput; i++){
            if(userInput % i == 0 ){
                isPrime = false;
                break;
            }
        }

        if(isPrime == true) System.out.println("voila " + userInput + " is a prime no");
        else if(isPrime == false) System.out.println("srry " + userInput + " is not a prime no");

    }
}
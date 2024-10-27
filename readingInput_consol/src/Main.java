import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

//        System.out.println();                 just for reference here
        Scanner hepMe = new Scanner(System.in);

        System.out.print("Age:");
        int age = hepMe.nextInt();
        System.out.print("Name:");
        String name = hepMe.next();             // this guy just reads the one word

        System.out.println("your age is " + age + "\n Your Name is " + name );


        // to read entire line use
        String fullName = hepMe.nextLine().trim();
        System.out.println("your full name is " + fullName );




    }
}
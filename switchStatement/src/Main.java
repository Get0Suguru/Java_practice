import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner hepMe = new Scanner(System.in);
        int passer = hepMe.nextInt();

        switch (passer) {
            case 1:{
                System.out.println("one pressed");
                break;
            }
            case 2:{
                System.out.println("two pressed");
                break;
            }
            case 3:{
                System.out.println("three pressed");
                break;
            }
            default:
                System.out.println("goldi bhadwa hai");
        }
    }
}
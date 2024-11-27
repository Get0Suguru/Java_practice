import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean isPalindrom = true;

        System.out.println("Enter the String");
        Scanner hepMe = new Scanner(System.in);
        String userInput = hepMe.nextLine();

        // approach is like reverse the string and match each characther of both using a loop or something
        // or if we can equate 2 strings maybe if possible lets try



        // matching the charachter of the stirng with its opposite characther
        int i = userInput.length();         // reversed char
        int j = 0;                          // straight char

        while (i != 0 ){
            if(userInput.charAt(j) != userInput.charAt(i-1)){
                isPalindrom = false;
                break;
            }
            i--;
            j++;
        }

        if(isPalindrom == true) System.out.println("yes palindrom");
        else if(isPalindrom == false) System.out.println("not a palindrom");
    }
}
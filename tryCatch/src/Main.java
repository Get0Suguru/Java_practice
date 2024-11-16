import java.lang.annotation.AnnotationTypeMismatchException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] myarr = {1,3,5,34};       // array of length 2 have only 0 as value

/*

        // lets make use of try catch

        try{
            System.out.println(myarr[3]);      // there we go error
        }catch (Exception e){                   // it will catch all the exceptions
            System.out.println("hey there is something wrong with the program");
        }

        // if there is nothing wrong with the try block code it will run and give result as per normall


 */
        // lets do the one with multiple type of exceptions
        try{
            System.out.println(myarr[6]);
        }catch (NullPointerException e){
            System.out.println("hey please check out ur array is null");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("you used some index that array doesn't have");
        }catch (Exception e){
            System.out.println("something else went wrong i also dk ");
        }

        System.out.println("enter the integer");
        Scanner hepMe = new Scanner(System.in);
        try{
            int x = hepMe.nextInt();
            System.out.println(x);
        }catch (InputMismatchException e){
            System.out.println("u shit i told u to enter a fuking no not some other data type");
        }catch (Exception e){
            System.out.println("idk what went wrong");
        }




    }
}
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        // throwing an exception on purpose for some reason

//        throw new IOException("hey u r shit u know that");

        int arr[] = new int[3];
        Scanner hepMe = new Scanner(System.in);
        System.out.println("enter the index of array u wanna print master");
        int x = hepMe.nextInt();
        if(x > arr.length -1 ){
            throw new ArrayIndexOutOfBoundsException("how many times i fking told u to not put index that is not available dumb shitty asshole ");
        }
        else{
            System.out.println(arr[x]);
        }

    }
}
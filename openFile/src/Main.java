import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
       // to open a file we need instance of file class
       // pass the path along with file name as string as atribute for instance
        File saxSux = new File("/Users/gauta/OneDrive/Desktop/session.txt");

        // step 2
        // we have the file its time to read it using scanner

        // as argument pass ur fileName
        Scanner hepMe = new Scanner(saxSux);

        // step 3 time to print
//        System.out.println(hepMe.nextLine());

        // to print the whole file
        while(hepMe.hasNextLine()){
            System.out.println(hepMe.nextLine());
        }
    }
}
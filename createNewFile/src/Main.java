import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        // lets take text from one file and move it to the next one
        File sex = new File("/Users/gauta/OneDrive/Desktop/session.txt");       // got file
        Scanner hepMe = new Scanner(sex);                                                  // to read file

        // Time For The Real Show // we will make a string copy everything to it // and then store it into a txt

        String gSpot = "wasting ur semen for sukh is bad it gives dukh its a illusion which is made to kill your atama";
        while(hepMe.hasNextLine()){
            gSpot = gSpot.concat(hepMe.nextLine() + "\n");
        }

        // to write string to file use FileWriter
        FileWriter lund = new FileWriter("/Users/gauta/OneDrive/Desktop/myVirginFile.txt");
        lund.write(gSpot);
        lund.close();

    }
}
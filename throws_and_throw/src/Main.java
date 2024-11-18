import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) throws  FileNotFoundException{
        /* ok ok letme quickly wind things up
        throw do manually throw exception even if its not (useCase - make ur custom exceptions and message)
        throws - throws prepare our program to jump from the hight
                 it will make him belief that its gonna scare u but not gonna kill so just jump/run
                  usecase - ur programm will not run

         */

        readMyFuckingFile();
        // note - if the method throws exception inside main means main will throw exception too
        // use one more throws




    }
    public static void readMyFuckingFile() throws FileNotFoundException {
        FileReader redMe = new FileReader("/Users/gauta/OneDrive/Desktop/session.txt");
        // voinks i forgot to use / in fornt of the Users
    }
}
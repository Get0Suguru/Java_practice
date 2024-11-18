import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        // 1. description - finally is the part of try catch which always run whether the exception comes or not
        // here letme show you

        Scanner hepMe = new Scanner(System.in);

        try{
            System.out.println(hepMe.nextInt());
        }catch(Exception e){
            System.out.println("something is wrong rerun the program and make sure u input correct shit");
        }finally{
            System.out.println("\n hi i am finally and i always run despite we got exception or not");
            hepMe.close();          // boring but imp gud practice stuff // oh yeah
        }

        // 2. whats the use of it - it is used to close objects, clear up the memory and etc etc boring stuff that need to be done
//            example - it is considered a gud practice to close the scanner object (so here comes finally)
    }
}
import org.w3c.dom.ls.LSOutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, InterruptedException {

// i have 2 approaches   (i) store the words from file the array list and get them randomly using the random no generator
//                      (ii) store the words into a hashset that will give me random shit (it will fail it just stores them randomly but will not shuffel it with each run)

        File words = new File("/Users/gauta/OneDrive/Desktop/txt.txt");
        Scanner fileReader = new Scanner(words);


//2//   now i need to get 10 random words from the file lets make a random word generator



//2//   now store the words from file to array list

        ArrayList<String> wordsList = new ArrayList<String>();
        for(int i = 0; i <1000; i++){
            wordsList.add(i, fileReader.next());
        }


//3//   Generating String for the test
        String testString = "";
        for(int i = 0 ;i<10;i++){
            testString += wordsList.get(randomNoGiver()) + " ";
        }
        System.out.println(testString);


//4//  ready steady go and the result part
        System.out.println("3");
        Thread.sleep(800);
        System.out.println("2");
        Thread.sleep(800);
        System.out.println("1");
        Thread.sleep(800);
        System.out.println("Go !!!!");

        long startTime = System.currentTimeMillis();

        Scanner inputReader = new Scanner(System.in);
        String resultString = inputReader.nextLine();

        int noOfWords = resultString.split("\\s+").length;          // the split method on a string will return an array of string and with lenght method u could find the no of word in it

        double  timeTaken =  (System.currentTimeMillis() - startTime) / 60000.0 ;
        double result =  resultString.length() / (timeTaken * 5.0) ;        // *5 coz an average word consists of 5 char



        if(noOfWords == 10){
            System.out.println("your typing speed is: " + Math.round(result) + " wpm");
        }else{
            System.out.println("test failed");
        }
    }




//2//
        public static int randomNoGiver() {
        Random kuchBhi = new Random();
        return kuchBhi.nextInt(0 , 999);
    }

}




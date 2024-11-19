import java.io.*;


// why i am reading this as hash map required base
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        // csv are like the Excel sheet where u have list of bunch of type of data but its seprated by , comma


        // bufferedReader is also user to read through just like the scanner but its faster
        String path = "/Users/gauta/OneDrive/Desktop/papa.csv";
        BufferedReader jaiJava = new BufferedReader(new FileReader(path));      // so it need a reader -> give FileReader -> ok it needs a file lets give path of file


        // use  .readLine to read the first line
        String sexo = "";


            try {
                while((sexo = jaiJava.readLine()) != null){
//                    System.out.println(sexo);
//                    break;            // lets try to seprate them out by using string seprator

                    String arr[] = sexo.split(",");        // returns a array of STring so lets put it equals
                    System.out.println("Police id :" + arr[0]  + " | something: " + arr[16]); // will get all values in the second column idk why not the first row but i m not interested in knowiing
//                    break;
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }


    }
}
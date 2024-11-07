import java.text.NumberFormat;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

//       if we make instance of it we could actually pass value rather then doing jugad
//        int x = (int)Math.ceil(Math.random() * 6) ;

        Random x = new Random();
        int randomNo = x.nextInt(6) + 1;            //
        System.out.println("You rolled a: " + x);


    }
}
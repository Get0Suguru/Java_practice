import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner hepMe = new Scanner(System.in);


        System.out.print("Principal: ");
        double principal = hepMe.nextDouble();

        System.out.print("Annual Interest Rate: ");                 // this guy comes in % okkay convert by dividing with 100
        double MonthlyInterest = hepMe.nextDouble() / (12 * 100) ;

        System.out.print("Period (Years): ");
        int period = hepMe.nextInt();


        double pow = Math.pow((1 + MonthlyInterest), (period * 12));
        double mortgage = principal * ((MonthlyInterest * pow) / (pow - 1));

        System.out.println("Mortgage: " + NumberFormat.getCurrencyInstance().format(mortgage));


    }
}
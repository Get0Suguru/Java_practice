import java.text.NumberFormat;

public class Main{
    public static void main(String[] args) {
        var getData = new CollectInitialData();

        double principal = getData.askAndRead("Principal", 1000, 10_00_000);
        double annualInterest = getData.askAndRead("Annual Interest", 1, 30);
        double period = getData.askAndRead("Period(in Years)", 1,30);

        double mortgage = MorgageCalculator.calculateMortgage((int)principal, (float)annualInterest, (byte)period);
        SexyPrint.out("mortgage", NumberFormat.getCurrencyInstance().format(mortgage));

        System.out.println("\nPAYMENT SCHEDULE: \n----------------");
        SexyPrint.makePaymentSch(MorgageCalculator.totalAmount, mortgage);


    }
}
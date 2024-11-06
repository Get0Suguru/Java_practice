import java.text.NumberFormat;

public class MorgageCalculator {
    public static double totalAmount;

    public static double calculateMortgage(
            int principal,
            float annualInterest,
            byte years) {

        float monthlyInterest = annualInterest / Constants.percent /Constants.monthsInYear;
        float numberOfPayments = years * Constants.monthsInYear;


        double mortgage = principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
        totalAmount = mortgage * numberOfPayments;

        return mortgage;
    }


}

import java.text.NumberFormat;

public class SexyPrint {
    public static void out(String lable, String mortgage) {
        System.out.println("\n" + lable.toUpperCase());
        for (int i = 0; i < lable.length(); i++) System.out.print("-");
        System.out.println("\nMonthly Payments: " + mortgage);
    }

    public static void makePaymentSch(double totalAmount, double monthlyBill) {
        double amount = totalAmount;
        while (amount > 0) {
            System.out.println(NumberFormat.getCurrencyInstance().format(amount));
            amount = amount - monthlyBill;
        }
    }
}

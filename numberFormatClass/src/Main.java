import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {
        int x = 1234567;

        // currency format (bad way)
        NumberFormat noFormatter = NumberFormat.getCurrencyInstance();
        String currency = noFormatter.format(x);
        System.out.println(currency);

        // percent format (optimal way)
        String percent = NumberFormat.getPercentInstance().format(.98);
        System.out.println(percent);

        // lets try new one
        String somethin = NumberFormat.getIntegerInstance().format(8034.34);
        System.out.println(somethin);

        String acchaDikoNo = NumberFormat.getNumberInstance().format(8793439);
        System.out.println(acchaDikoNo);
    }
}
import java.util.Scanner;

public class CollectInitialData {

    public double askAndRead(String dataName, float min, float max){
        Scanner hepMe = new Scanner(System.in);
        float dataValue;

        while(true) {
            System.out.print(dataName+ ": ");
            dataValue = hepMe.nextFloat();
            if (dataValue < min || dataValue > max) {
                System.out.println("the value has to be between " + min + " and " + max);
            }
            else break;
        }
        return dataValue;
    }
}


import java.sql.Array;

public class Main {
    public static void main(String[] args) {

        int[] aalu = new int[]{1, 3, 2, 5, 6, 73, 19, 34, 18};
//        linearSearch()        why it doesn't work till its nonstatic coz in the inside implicitly its doing Main.main.linearSearch  as main is static works without making obj || linear search has to be static too to wrok directly without making main class object

        int index = linearSearch(aalu, 5);
        if(index != -1){
            System.out.println("element found at index:" + index);
        }
        else System.out.println("element not found");

    }

    public static int linearSearch(int[] array, int valueToSearch) {
        for (int x = 0; x < array.length; x++) {
            if (array[x] == valueToSearch) {
                return x;
            }
        }
        return -1;
    }
}
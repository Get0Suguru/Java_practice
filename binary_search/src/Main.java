public class Main {
    public static void main(String[] args) {

        // for binary search the array has to be sorted so we making an array that is already sorted

//        int[] papaBol = new int[100];
//      for larger data sets the performence of binary serach increases alot see
        int[] papaBol = new int[1000000];

        for(int i=0;i<1000000;i++){
            papaBol[i] = i+5;
        }


        // finding the element using binary search function
        int value = binarySearch(papaBol, 47);
        if(value != -1){
            System.out.println("element found at index:" + value);
        }
        else System.out.println("element not found");


    }

    public static int binarySearch(int[] array, int targetValue) {

        int low = 0;
        int high = array.length;

        while(low <=high) {                  // their is preety good logic behind this u will get if u know how binary search divide and discard the part and make new low and high then think about this u will get it
            int middle = low + (high - low) / 2;        // formula to find the middle without getting the decimal type
            if (array[middle] > targetValue)
                high = middle - 1;       // middle one also removed and the part after middle (left in array) as the element is less then middle (vizulize)
            else if (array[middle] < targetValue)
                low = middle + 1;     // middle one also removed with the part before middle
            else if (array[middle] == targetValue) return middle;

            System.out.println("middle:" + middle);
        }
        return -1;
    }
}
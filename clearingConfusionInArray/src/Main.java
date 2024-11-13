

public class Main {
    public static void main(String[] args) {

        // exception use index of an array that doesn't exist
        int[] arr = new int[2];
        arr = new int[]{1, 2, 4, 3};

        // POINT -0  there is nothing wrong if u write it like that
        int arr0[] = new int[2];        // all gud

        // bit confused in array  ( ways to create array without initialization)
        int[] arr1 = new int[2];
        int[] arr2 = {};
        int[] arr3 = new int[]{};

        // all the ways to make array with my data in it;
        int[] arr4 = new int[]{1,2,3,4};
        int[] arr5 = {1,2,3,4};
        // in arr1 kind of array only way to modify is go index by index and change

        // completely reassing a new array // can change its no of element but not the type // as arr1 can only store 2 values see
        arr1 = new int[]{1,2,3,5,5,323};
        arr1 = new int[30]; // by default array store 0 in it as each element ohhh

        System.out.println(arr1[2]);



    }
}
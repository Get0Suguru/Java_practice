import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


// 1.        int[][] testArray = new int[3][];

        // or  make it like that

//        int[][] array2d = {
//                {2,3,4},
//                {3,5,4},
//                {7,8,5}
//        };

        int[][] arrayOfArrays = {
                {2, 3, 4},
                {3, 4},
                {5, 6, 7, 8}
        };
        System.out.println(arrayOfArrays.length + " will actually return the no of rows of the multidArray");

        // how to take input in that shit // pretty eazy like we do by 2 forloops

        Scanner hepMe = new Scanner(System.in);

        for (int row = 0; row < arrayOfArrays.length; row++) {
            for (int customLength = 0; customLength < arrayOfArrays[row].length; customLength++) {
                    arrayOfArrays[row][customLength] = hepMe.nextInt();
            }
            System.out.println(row+1  + "st row done");
        }

        System.out.println("i m lazy to print 2d array fk off still gonna do it\n\n");


        for(int[] simple1D: arrayOfArrays){
            System.out.println(Arrays.toString(simple1D));
        }

        System.out.println("gg good shit");

    }
}
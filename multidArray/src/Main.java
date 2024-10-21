import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//         how to make empty multidimensional array
        int[][] arr = new int[2][3];            // here comes the size during use we pass index so 1- karke simple
        int [][][] arr2 = new int[3][3][3];

        arr[1][2] = 30;
        System.out.println(Arrays.deepToString(arr));


        // multidimensional array initialized
        int[][] arr3 = {{1,3,4}, {5,6,7}};
        System.out.println(Arrays.deepToString(arr3));

        char[][] ticTacToe = {{'X', 'O', 'O'}, {'O', 'X', ' '}, {'X', ' ', 'X'}};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                switch (ticTacToe[i][j]) {
                    case 'X': {
                        ticTacToe[i][j] = 'O';
                        break;
                    }
                    case 'O': {
                        ticTacToe[i][j] = 'X';
                        break;
                    }
                }
                System.out.print(ticTacToe[i][j]);
//                if(ticTacToe[i][j] == 'X'){
//                    ticTacToe[i][j] ='O';
//                }
            }
            System.out.println();
        }
    }
}
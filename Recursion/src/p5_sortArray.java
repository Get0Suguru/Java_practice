import java.util.Arrays;

public class p5_sortArray {
    static int temp = 0;

    public static void main(String[] args) {
        int[] arr = {1,4,3,2,5,2};
        sort(arr, 5);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr,int pointer){
        // base case
        if(pointer == 0) return;

        // induction  + is the work has to be done first or last (in that case the lastest ones work has to be done) so rec first work after that
        sort(arr, pointer-1);
        insert(arr, pointer);

    }
    //another recursion for insertion
    static void insert(int[] arr, int potter){
        // base case
        if(potter == 0) return;
        if(arr[potter] > arr[potter-1]) return;

        // induction
        temp = arr[potter];
        arr[potter] = arr[potter - 1];
        arr[potter-1] = temp;
        insert(arr, --potter);
    }
}

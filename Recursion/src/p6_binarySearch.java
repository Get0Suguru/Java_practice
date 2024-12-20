
// can only do on a acsending order sorted array
public class p6_binarySearch {
    static int starter = 0;
    static int pointer = 0;
    static int midWay = 0;
    public static void main(String[] args) {
        int[] arr = {2,5,5,6,7,8,19,39,46,56,76,77,87,98};
        pointer = arr.length - 1;

        System.out.println(binarySearch(arr, 56));

    }

    static int binarySearch(int[] arr,int target){
        midWay = (starter + pointer) / 2;

        // base case
        if(arr[midWay] == target) return midWay;
        if(starter == pointer) {
            System.out.println("srry element not found fk you");
            return 0;
        }

        // induction

        if(arr[midWay] > target) {
            pointer = midWay-1;
            return binarySearch(arr, target);
        }
        else{
            starter = midWay + 1;
            return binarySearch(arr, target);
        }
    }
}

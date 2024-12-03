

public class Main {
    public static void main(String[] args) {
        // only increasing order sorted array allowed
        int x = binarySearch(new int[]{ 339, 341, 341, 357, 359, 375, 376,617, 621, 630, 642, 670},
                359);
        System.out.println(x);
    }

    public static int binarySearch(int[] sortedArray, int target) {
        int left = 0;
        int right = sortedArray.length - 1;
        int middle = (left + right) / 2;

        while (right >= left) {
            if (sortedArray[middle] == target) return sortedArray[middle];
            else if (sortedArray[middle] > target) {
                right = middle - 1;
                middle = (left + right) / 2;
            }
            else if(sortedArray[middle] < target ){
                left = middle + 1;
                middle = (left + right) / 2;
            }
        }
        return -1;
    }
}


// using dibugger is a bad thing use it to close ur brain and now you spend alot of time on extremelly simple stuff wtf

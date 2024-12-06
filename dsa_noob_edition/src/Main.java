import java.util.*;

public class Main {
    public static void main(String[] args) {
        removeDuplicates(new int[]{1,1,2});


    }

    public static int removeDuplicates(int[] nums) {
        ArrayList<Integer> answerList = new ArrayList<>();

        int i=0;
        int j=0;        // index tracker for array list
        answerList.add(i, nums[i]);
        while(i < nums.length){
            if(answerList.get(j) != nums[i]){
                answerList.add(nums[i]);
                i++;
                j++;
            }
            else i++;
        }

        
        return answerList.size();
    }
}
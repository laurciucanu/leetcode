import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 5;

        System.out.println(Solution.searchInsert(nums, target));
    }

    public static class Solution {
        public static int searchInsert(int[] nums, int target)
        {
            int n = nums.length;
            for(int i = 0 ; i < n ; i++)
            {
                if(nums[i] >= target){
                    return i;
                }

            }
            return n;
        }

    }
}
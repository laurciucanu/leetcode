import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {-4, -1, 0, 3, 10};

        System.out.println(Arrays.toString(Solution.sortedSquares(nums)));
    }

    public static class Solution {
        public static int[] sortedSquares(int[] nums) {
            for(int i = 0; i<nums.length; i++){
                nums[i] = nums[i] * nums[i];
            }

            Arrays.sort(nums);

            return nums;
        }
    }
}
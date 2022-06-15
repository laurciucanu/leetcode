import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        int[] testArray = {2, 7, 11, 15};
        int target = 9;

        System.out.println(Arrays.toString(Solution.twoSum(testArray, target)));

    }

    public static class Solution {
        public static int[] twoSum(int[] nums, int target) {

            int[] ans = new int[2];

            HashMap<Integer, Integer> map = new HashMap<>();

            for (int index = 0; index < nums.length; index++) {

                if (!map.containsKey(nums[index])) {

                    map.put(target - nums[index], index);

                } else {
                    ans[0] = index;
                    ans[1] = map.get(nums[index]);
                    break;
                }
            }

            return ans;
        }
    }
}
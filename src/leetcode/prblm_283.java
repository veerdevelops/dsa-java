package leetcode;

public class prblm_283 {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};

        Solution sol = new Solution();
        sol.moveZeroes(nums);

        // Print result
        System.out.print("Array after moving zeroes: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}

class Solution {
    public void moveZeroes(int[] nums) {
        int j = 0; // pointer for placement

        // Step 1: move all non-zero elements forward
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            }
        }

        // Step 2: fill remaining positions with zeros
        while (j < nums.length) {
            nums[j] = 0;
            j++;
        }
    }
}

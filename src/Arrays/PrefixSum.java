package Arrays;

public class PrefixSum{
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};

        // Build prefix sum directly in nums
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i - 1];//updates the current ele nums i by adding previous prefix sum
        }

        // Print prefix sum array
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
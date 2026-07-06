package leetcode;

public class prblm_268 {

    public static int missingNumber(int[] nums) {

        int n = nums.length;

        // Expected sum from 0 to n
        long expectedSum = (long) n * (n + 1) / 2;

        // Actual sum of array
        long actualSum = 0;

        for (int i = 0; i < n; i++) {
            actualSum += nums[i];
        }

        // Missing number
        return (int) (expectedSum - actualSum);
    }

    public static void main(String[] args) {

        int[] nums = {3, 0, 1};

        int result = missingNumber(nums);

        System.out.println("Missing Number: " + result);
    }
}
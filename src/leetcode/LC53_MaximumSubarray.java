package leetcode;

public class LC53_MaximumSubarray {

    public static void main(String[] args) {

        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int sum = 0;
        int maxSum = Integer.MIN_VALUE; // Smallest possible integer

        for (int i = 0; i < nums.length; i++) {

            sum = sum + nums[i]; // Adds current element to running sum

            if (sum > maxSum) { // Update maximum sum found so far
                maxSum = sum;
            }

            if (sum < 0) { // If running sum becomes negative, reset it
                sum = 0;
            }
        }

        System.out.println("Maximum Subarray Sum: " + maxSum);
    }
}
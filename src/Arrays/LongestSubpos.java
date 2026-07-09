package Arrays;

public class LongestSubpos {
    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 1, 1, 2, 3};
        int k = 5;

        Solution sol = new Solution();
        int result = sol.longestSubarrayWithSumK(nums, k);
        System.out.println("Longest subarray length with sum = " + k + " is: " + result);
    }
}

class Solution {
    public int longestSubarrayWithSumK(int[] nums, int k) {
        int i = 0;
        int j = 0;
        int sum = 0;
        int maxLen = 0;

        while (j < nums.length) {
            sum += nums[j];

            // shrink window until sum <= k
            while (sum > k) {
                sum -= nums[i];
                i++;
            }

            // check if valid subarray
            if (sum == k) {
                maxLen = Math.max(maxLen, j - i + 1);
            }

            j++;
        }

        return maxLen;
    }
}

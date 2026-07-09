package Arrays;

public class LongestSubpos {
    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 1, 1, 2, 3};
        int k = 5;

        int i = 0;
        int j = 0;
        int sum = 0;
        int maxLen = 0;

        while (j < nums.length) {
            sum += nums[j];

            // isme pointer agae jata hai
            while (sum > k) {
                sum -= nums[i];
                i++;
            }

            // isme agar k aur sum same hai toh validity check krte hai
            if (sum == k) {
                maxLen = Math.max(maxLen, j - i + 1);
            }

            j++;
        }

        System.out.println("Longest subarray length with sum = " + k + " is: " + maxLen);
    }
}

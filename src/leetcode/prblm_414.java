package leetcode;
//This is brute force method not the optimal solution take time complexity 0(n).
public class prblm_414 {

    public static void main(String[] args) {

        int[] nums = {2, 2, 3, 1};

        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int thirdMax = Integer.MIN_VALUE;

        boolean hasSecond = false;
        boolean hasThird = false;

        // Loop 1 - Find First Maximum
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > firstMax) {
                firstMax = nums[i];
            }
        }

        // Loop 2 - Find Second Maximum
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < firstMax && nums[i] > secondMax) {
                secondMax = nums[i];
                hasSecond = true;
            }
        }

        // Loop 3 - Find Third Maximum
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < secondMax && nums[i] > thirdMax) {
                thirdMax = nums[i];
                hasThird = true;
            }
        }

        if (hasThird) {
            System.out.println("Third Maximum = " + thirdMax);
        } else {
            System.out.println("Third Maximum doesn't exist.");
            System.out.println("Return Largest = " + firstMax);
        }
    }
}
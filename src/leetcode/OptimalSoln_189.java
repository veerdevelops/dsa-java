package leetcode;

import java.util.Arrays;

public class OptimalSoln_189 {

    public static void reverse(int[] nums, int start, int end) {//this method reverses a part of an arry

        while (start < end) {//swap ,move both pointer,repeat

            int temp = nums[start];//store left value temp
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }
    }

    public static void rotate(int[] nums, int k) {

        int n = nums.length;

        k = k % n;

        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        rotate(nums, k);

        System.out.println(Arrays.toString(nums));
    }
}
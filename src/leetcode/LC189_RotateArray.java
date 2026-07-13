package leetcode;

public class LC189_RotateArray {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5,6,7};
        int k=3;
        int n = nums.length;
        int []temp = new int [k];
        for (int i = 0; i < k; i++) {
            temp[i] = nums[n - k + i];
    }
        for (int i = n - k - 1; i >= 0; i--) {
            nums[i + k] = nums[i];
        }
        for (int i = 0; i < k; i++) {
            nums[i] = temp[i];



}
       System.out.print("Array after right rotation by " + k + ": ");
        for (int num : nums) {
            System.out.print(num + " ");
        }}}
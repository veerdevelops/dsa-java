package Arrays;

public class linear_search {

    public static int linearSearch(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == target) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] nums = {4, 7, 1, 9, 5};
        int target = 9;

        int result = linearSearch(nums, target);

        System.out.println("Target found at index: " + result);
    }
}
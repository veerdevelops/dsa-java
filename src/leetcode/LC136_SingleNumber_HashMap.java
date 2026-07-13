package leetcode;
// hashmap hai bhai key value
import java.util.HashMap;

public class LC136_SingleNumber_HashMap {

    public static int singleNumber(int[] nums) {

        // Create a HashMap to store frequency
        HashMap<Integer, Integer> map = new HashMap<>();

        // Store frequency of each element
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Find the element whose frequency is 1
        for (int num : nums) {
            if (map.get(num) == 1) {
                return num;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] nums = {4, 1, 2, 1, 2};

        int result = singleNumber(nums);

        System.out.println("Single Number: " + result);
    }
}
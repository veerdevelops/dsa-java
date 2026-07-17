package leetcode;

import java.util.HashMap;

public class LC169_MajorityElement {
    public static void main(String[] args) {
        int[] nums = {3, 2, 3};
        int n = nums.length;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);

            if (map.get(num) > n / 2) {
                System.out.println("Majority Element: " + num);
                return;
            }
        }

        System.out.println("No majority element found");
    }
}

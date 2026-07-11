package leetcode;
import java.util.HashMap;
public class prblm_325 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int k = 3;
        int prefixSum = 0;//initially 0 rehta hai
        int maxLen = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        //prefix sum+first index store krta hai
        for (int i = 0; i < nums.length; i++) {//each element in an array
            prefixSum += nums[i];//just goes to next element and calc running total
            if (prefixSum == k) {//if k == prefix sum subarray starts from 0
                maxLen = i + 1;//length of that element
            }
            int remaining = prefixSum - k;//means have we seen this prefix number before
            if (map.containsKey(remaining)) {
                int length = i - map.get(remaining);//there to ask if 9 is written if no continue
                maxLen = Math.max(maxLen, length);//sliding window jaise hii take whch is bigger
            }
            if (!map.containsKey(prefixSum)) {//we dont overwrite just first occurence
                map.put(prefixSum, i);


            }
            System.out.println("Longest subarray length with sum = " + k + " is: " + maxLen);
        }//print the i for sub arrays
    }}
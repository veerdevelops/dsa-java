package leetcode;

import java.util.HashMap;

public class prblm_560 {
    public static void main(String[] args) {
        int []nums = {1,2,3};
        int k = 3;
        int prefixSum =0;
        int count = 0;
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,1);
        for (int i=0;i<nums.length;i++){
            prefixSum+=nums[i];
            int remaining = prefixSum -k;
            if (map.containsKey(remaining)){
                count +=map.get(remaining);
            }
            map.put(prefixSum,map.getOrDefault(prefixSum,0)+1);
        }
        System.out.println("Total subarrays with sum = " + k + " is: " + count);
    }

}

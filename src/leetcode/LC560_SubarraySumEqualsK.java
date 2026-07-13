package leetcode;

import java.util.HashMap;

public class LC560_SubarraySumEqualsK {
    public static void main(String[] args) {
        int []nums = {1,2,3};
        int k = 3;
        int prefixSum =0;//initialise krta hai
        int count = 0;
        HashMap<Integer,Integer>map=new HashMap<>();//hashmap hai value--> frequency not same as lc 325
        map.put(0,1);//initial 0 index se start hoga
        for (int i=0;i<nums.length;i++){
            prefixSum+=nums[i];//sum find hota hai by going to the next element
            int remaining = prefixSum -k;//common formula to calc the occurence
            if (map.containsKey(remaining)){//remainig repreting count add
                count +=map.get(remaining);
            }
            map.put(prefixSum,map.getOrDefault(prefixSum,0)+1);// basic hashmap req for adding frequency
        }
        System.out.println("Total subarrays with sum = " + k + " is: " + count);//print les goo
    }

}

package leetcode;

import java.util.HashMap;

public class prblm_1optimal {
    public static void main(String[] args) {
        int []nums = {2,7,11,15};
        int target = 9;
        HashMap<Integer ,Integer> map = new HashMap<>();//hashmap create
        for (int i=0;i<nums.length;i++){//traversing
            int remaining = target - nums[i];//if 9 then 9-2? = 7 no them 2->0 then 9-7=2 2 before yes then {0,1}
            if ( map.containsKey(remaining)){
                System.out.println("Indices: "+ map.get(remaining)+ ", "+i);
                return;
            }
            map.put(nums[i],i);
        }
        System.out.println("no solution found,");
    }
}

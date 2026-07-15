package leetcode;
import java.util.Arrays;
public class LC75_SortColorsBrute {
    public static void main(String[] args) {
        int []nums = {2,0,2,1,1,0};
        Arrays.sort(nums);
        for (int i = 0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
}
//this shit is not optimised time complex=0(n log n )
//we can still optimise it to 0(n)
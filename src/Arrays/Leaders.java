package Arrays;//time com = 0(n)//spcae also same
import java.util.*;
public class Leaders {
    public static void main(String[] args) {
        int nums[] = {10,22,12,3,0,6};
        int n = nums.length;
        List <Integer> leaders= new ArrayList<>();
        int max = nums[n-1];
        leaders.add(max);
        for (int i = nums.length-2;i>=0;i-- ){
            if (nums[i]>max){
                leaders.add(nums[i]);
                max = nums [i];
            }
        }
        Collections.reverse(leaders);
        System.out.println(leaders);

    }
}

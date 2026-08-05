package leetcode;
import java.util.Arrays;
//try to make the smallest possible change start from the  right left krgea toh huge chnage sudden change(impact large)
public class LC31_NextPermutation {
    public static void main(String[] args) {
        int []nums = {1,2,3,6,5,4};
        int pivot =-1;//first index from right nums[i]<nums[i+1];
        for(int i = nums.length-2;i>=0;i--){//start from the second last element because compare i+1
            if(nums[i]<nums[i+1]){//move left until find this condition
                pivot=i;//index stored in pivot
                break;
            }
        }
        if (pivot ==-1){//if pivot is -1 array is in descending order means last permutation
            int start =0,end = nums.length-1;
            while(start<end){
                int temp = nums[start];
                nums[start]=nums[end];
                nums[end]= temp;
                start++;
                end--;//reversing th array if pivot stays -1
            }
        }else{//if pivot exist fidn the smaleest element grater then pivot
            int j = nums.length-1;//ensures next permutation is smallest
            while(nums[j]<=nums[pivot]){
                j--;
            }
            int temp = nums[pivot];
            nums[pivot]=nums[j];//swap the pivot with that element
            nums[j]=temp;
            int start = pivot +1 ,end =nums.length-1;
            while (start<end){//reverses everythin after pivot
                int temp2= nums[start];
                nums[start]=nums[end];//this ensures the sufffix is an ascending order,giving the next smallest permutation
                nums[end]=temp2;
                start++;
                end--;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}

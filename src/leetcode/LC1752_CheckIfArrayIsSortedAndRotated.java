package leetcode;

public class LC1752_CheckIfArrayIsSortedAndRotated {
    public static void main(String[] args) {
     int [] nums = {3,7,5,6,2};
     int count =0;
     for (int i=0;i<nums.length;i++){
         if (nums[i] > nums[(i+1)% nums.length]) {//use ts for calc in first n last ele
             count++;
         }
     }
     System.out.println(count <=1);
    }
}

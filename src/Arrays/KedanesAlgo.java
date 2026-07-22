package Arrays;

public class KedanesAlgo {
    public static void main(String[] args) {
        int []nums = {-2,1,-3,4,-1,2,1,-5,4};
        int sum =0;
        int maxSum = Integer.MIN_VALUE;//smallest possible integer
        for(int i =0;i<nums.length;i++){
            sum = sum +nums[i];//addds current element to the running sum
            if (sum>maxSum){//running sum with largest sum found so far
                maxSum=sum;
            }
            if(sum<0){//main logic current sum becomes negative reset
                sum =0;
            }
        }
        System.out.println("Maximum Subarray Sum:" + maxSum);
    }
}

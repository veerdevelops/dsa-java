package leetcode;
//brute force is already optimal BIG O Complexity is already optimised just a little more space memory diffrence doesnt make a shit of diffrence
public class LC2149_RearrangeArrayElementBySign {
    public static void main(String[]  args) {
        int []nums = {3,1,-2,-5};
        int []result = new int[nums.length];//new array to store the answer
        int postIndex =0;//postive number will be placed
        int negIndex=1;//negative numbers will be placed
        for(int num:nums){//every element.
            if(num>0){//if current elemnt is +ve.
                result[postIndex]=num;
                postIndex+=2;
            }else{
                result[negIndex]=num;//the number is negative
                negIndex+=2;//move to the next odd index
            }
        }
        for (int num : result){
            System.out.print(num + " ");//print result
        }
    }
}
//If the final position of each type of element is already known, place elements directly at those indices instead of rearranging later
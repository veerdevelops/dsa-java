package Arrays;
//using two pointer
public class remve_duplicates {
    public static void main(String[] args) {
        int []nums ={1,1,2,2,2,3,4,4};
        int i =0;
        for (int j=1;j<nums.length;j++){
            if(nums[j]!=nums[i]){
                i++;
                nums[i]=nums[j];
            }
        }
        System.out.println("Number of unique elements: " + (i + 1));
    }
//two pointer first solve
}

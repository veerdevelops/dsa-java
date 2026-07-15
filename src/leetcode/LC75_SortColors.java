package leetcode;//o left //1 mid //right
//Dutch national flag
//Array divided 01|1s|unknown|2s
//low  → Where the next 0 should go.
//mid  → The element we are currently checking.
//high → Where the next 2 should go.
public class LC75_SortColors {
    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};
        int low = 0;//tells us where 0 should be placed
        int mid = 0;//elements we r checking
        int high = nums.length - 1;//where the next 2 should be placed 6 ele so 6-1=5
        while (mid <= high) {//if mid>high every ele should be checked
            if (nums[mid] == 0) {//zero belongs on left
                int temp = nums[low];//temp save val at low
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;

            } else { // nums[mid] == 2
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }

        }
for (int num : nums){
    System.out.print(num + " ");

    }}}
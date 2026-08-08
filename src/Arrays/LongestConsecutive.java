import java.util.*;

public class LongestConsecutive {
    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int longest = 0;


        for (int x : set) {

            if (!set.contains(x - 1)) {
                int current = x;
                int length = 1;


                while (set.contains(current + 1)) {
                    current++;
                    length++;
                }

                //longest length
                longest = Math.max(longest, length);
            }
        }

        System.out.println("Longest consecutive sequence length = " + longest);
    }
}

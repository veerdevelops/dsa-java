package Arrays;

import java.util.ArrayList;

public class Union_Sorted {

    public static ArrayList<Integer> findUnion(int[] arr1, int[] arr2) {

        int n = arr1.length;
        int m = arr2.length;

        int i = 0;
        int j = 0;

        ArrayList<Integer> union = new ArrayList<>();

        while (i < n && j < m) {

            if (arr1[i] <= arr2[j]) {

                if (union.isEmpty() || union.get(union.size() - 1) != arr1[i]) {
                    union.add(arr1[i]);
                }

                i++;

            } else {

                if (union.isEmpty() || union.get(union.size() - 1) != arr2[j]) {
                    union.add(arr2[j]);
                }

                j++;
            }
        }

        while (i < n) {

            if (union.isEmpty() || union.get(union.size() - 1) != arr1[i]) {
                union.add(arr1[i]);
            }

            i++;
        }

        while (j < m) {

            if (union.isEmpty() || union.get(union.size() - 1) != arr2[j]) {
                union.add(arr2[j]);
            }

            j++;
        }

        return union;
    }

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 2, 3, 4};
        int[] arr2 = {2, 3, 5};

        ArrayList<Integer> result = findUnion(arr1, arr2);

        System.out.println(result);
    }
}
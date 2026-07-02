package Arrays;

public class rotateD {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int d = 3;
        int n = arr.length;

        //  store first d elements
        int[] temp = new int[d];
        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }

        //  shift remaining elements left
        for (int i = d; i < n; i++) {
            arr[i - d] = arr[i];
        }

        //  copy stored elements to end
        for (int i = 0; i < d; i++) {
            arr[n - d + i] = temp[i];
        }

        // Display result
        System.out.print("Array after left rotation by " + d + ": ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

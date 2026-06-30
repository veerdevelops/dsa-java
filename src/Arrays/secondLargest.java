package Arrays;
public class secondLargest{
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        int largest = arr[0];
        int secondLargest = Integer.MIN_VALUE;//this fn is used for smallest possible valaue
        for (int i =1;i<arr.length;i++){
            if (arr[i]>largest){
                secondLargest=largest;
                largest = arr[i];
        }
       else if (arr[i]>secondLargest && arr[i]<largest){
           secondLargest=arr[i];
            }
            System.out.println("Largest: " + largest);
            System.out.println("Second Largest: " + secondLargest);
        }
    }
}
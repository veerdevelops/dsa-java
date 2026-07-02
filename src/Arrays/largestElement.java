package Arrays;
// linear traversal hai ye
public class largestElement {
    public static void main(String[] args) {
        int[]arr ={10,20,5,100,30};
        int max =arr[0];//assuming fst ele is largest
        for (int i = 0; i < arr.length; i++){
            if(arr[i]>max){//is currnt ele > max
                max = arr[i];
            }
        }
        System.out.println("Largest Element: " + max);
    }
}

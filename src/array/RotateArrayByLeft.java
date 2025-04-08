import java.util.Arrays;

public class RotateArrayByLeft {

    //Rotate Array to the Left by k Positions

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        rotateLeft(arr, k);
        System.out.println("Left Rotated: " + Arrays.toString(arr));
    }

    public static void rotateLeft(int[] arr , int k) {

        int n = arr.length;
        k = k % n;

        reverse(arr, 0,k-1 );
        reverse(arr,k,n-1);
        reverse(arr,0,n-1);
    }
        public static void reverse(int[] arr , int start,int end){
           while(start<end) {
               int temp = arr[start];
               arr[start] = arr[end];
               arr[end] = temp;
               start++;
               end--;


           }

    }
}

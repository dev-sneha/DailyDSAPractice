public class SecondLargest {
    public static void main(String[] args) {


        int[] arr = {1, 2, 5, 4, 3, 0,4,5,4,5};
        int largest=0;
        int secondLargest= 0;


        for(int i = 0; i < arr.length; i++){
            if(arr[i]>largest){
                secondLargest = largest;
                largest= arr[i];
            }else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }

        }
        System.out.println("secondLargest: {}" + secondLargest);

    }

}

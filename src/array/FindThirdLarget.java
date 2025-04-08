public class FindThirdLarget {
    public static void main(String[] args) {


        int[] arr = {1, 2, 5 , 4, 6, 7};
        int largest = 0;
        int secondLargest = 0;
        int thirdlargest= 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                thirdlargest= secondLargest;
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i]<largest) {
                thirdlargest = secondLargest;
                secondLargest = arr[i];
            }else if(arr[i]>thirdlargest && arr[i]<secondLargest){
                thirdlargest= arr[i];
            }

        }
        System.out.println("thirdlarget: {}" + thirdlargest);
    }
}

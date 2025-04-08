public class MaxProductTriplet {

    public static void main(String[] args) {
        int[] arr = {10,3,5,1,20};
        int largest =0;
        int secondLargest =0;
        int thirsLargest=0;


        for(int i =0;i<arr.length;i++){
            if(arr[i]>largest){
                thirsLargest= secondLargest;
                secondLargest= largest;
                largest= arr[i];
            } else if (arr[i]> secondLargest && arr[i]<largest) {
                secondLargest= arr[i];

            } else if (arr[i]> thirsLargest && arr[i]<secondLargest) {
                thirsLargest= arr[i];

            }


        }


        System.out.println(largest* secondLargest*thirsLargest);



    }
}

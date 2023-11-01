package array;

//Second-Largest Element in the Array
public class FindSecondLargestElement {

    public static void main(String[] args) {

        int arr[] ={2,4,5,6,8,10,11};
        int max=Integer.MIN_VALUE;
        int secondMax=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                secondMax=max;
                max=arr[i];

            } else if (arr[i]>secondMax && arr[i]!=max) {

                secondMax=arr[i];


            }

        }


        System.out.println(secondMax);









    }

}

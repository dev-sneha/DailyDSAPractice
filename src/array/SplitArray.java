public class SplitArray {

    public static void main(String [] args){
        int [] arr={4,13,6,5,7,8,9,2,10};

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp= arr[i];
                    arr[i]= arr[j];
                    arr[j]= temp;

                }
            }
        }
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }

        System.out.println();
        for(int i =0;i<arr.length/2;i++){

            System.out.print(arr[i]+ " ");
        }

        for(int j=arr.length-1;j>=arr.length/2;j--){
            System.out.print(arr[j]+ " ");
        }
    }
}

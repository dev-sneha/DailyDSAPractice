class LargestElement{
    
    public static int Largest(int arr[]){
        int largest= Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(largest<arr[i]){
                secondLargest= largest;
               largest=arr[i];

            }
            else if(arr[i]>secondLargest && arr[i]!= largest){
                secondLargest= arr[i];


            }

        }
        return secondLargest;
        }

        public static void main(String[] args) {
            int  arr[]= {1,2,4,6,8,9};     
            System.out.println("largest element: "+ Largest(arr));                              
        
        
        
    }
}
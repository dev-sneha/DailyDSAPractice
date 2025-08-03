class MaxSubarray{

    // public static void maxArray(int arr[]){
    //     int max = Integer.MIN_VALUE;
      
    //     for(int i=0;i<arr.length;i++){
    //         for(int j=i;j<arr.length;j++){
    //           int curr= 0;
    //              for(int k=i;k<=j;k++){
    //              curr= curr+arr[k];

    //             }   
    //             System.out.println(curr);
    //             if(max <curr){
    //                 max= curr;

    //             }

    //         }
    //     }
    //     System.out.println("max sum :" +max);

    // }


    // we can do it with two ways on is above(which is brute force) and second is prefix sum
    //in prefix sum in an another array we calculate prefix how - like [1|-1| 5|4|7] 1,1+(-2), -1+6, 5+(-1),4+3
    // prefix[i-1] +arr[i]




    public static void maxArray(int arr[]){
       int max = Integer.MIN_VALUE;
       int curr= 0;
       int prefix[] = new int[arr.length];

          int start = 0;
        int end = 0;

       //calculate prefix
       prefix[0] = arr[0];
       for(int i=1;i<prefix.length;i++){
        prefix[i]= prefix[i-1] +arr[i]; //[1|-1| 5|4|7]
       
       }
       for(int i=0;i<arr.length;i++){
        for(int j=i;j<arr.length;j++){

            curr = i==0 ? prefix[j]: prefix[j] - prefix[i-1] ;
            if(max<curr){
                max=curr;
                start=i;
                end =j;
               
            }

        }       
        }
        System.out.println("max sum of subarray : "+ max);
          
    }


    public static void kadanes(int arr[]){
        int ms= Integer.MIN_VALUE;
        int cs=0;
        for(int i=0;i<arr.length;i++){
            cs= cs+arr[i];
            if(cs<0){
                cs=0;
            }
            ms = Math.max(cs, ms);
        }
        System.out.println("our max su of subarray : "+ ms);

    }

    

    public static void main(String[] args) {
        // int arr[]={2,4,6,8,10,12,14};
        // int arr[]={1,-2,6,-1,3};
        int arr[]= {-2,-3,4,-1,-2,1,5,-3};
        // maxArray(arr);
        kadanes(arr);
    }
}
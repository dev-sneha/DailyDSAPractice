class SortingRecursion{

    public static boolean isSortted(int arr[] , int i){

        if(i== arr.length-1){
            return true;
        }
        if(arr[i] >arr[i+1]){
            return false;
        }

      return isSortted(arr, i+1);

    }


    public static void main(String[] args) {

        int arr[]={1,2,3,5};

        System.out.println(isSortted(arr, 0));
        
    }
}
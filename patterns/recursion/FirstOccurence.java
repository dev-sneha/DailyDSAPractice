class FirstOccurence{

    public static int firstOcc(int arr[], int key, int i){
        if(arr[i]==key){
            return i;
        }

        return firstOcc(arr, key, i+1);

    }

    public static int lastOcc(int arr[], int key, int i){

        if(i== arr.length){
            return -1;
        }

       int found=   lastOcc(arr, key, i+1);
       if(found == -1 && arr[i]==key){
        return i;
       }

       return  found;


    }
    


    public static void main(String[] args) {

        int arr[]= { 3,3,8,23,4,5,7,2,6,5};
        int key = 5;
        System.out.println(firstOcc(arr, key, 0));
        System.out.println(lastOcc(arr, key, 0));

        
    }




}
class Linear{


    public static int LinearSearch(int arr[], int key){
        for(int i=1;i<=arr.length;i++){
            if(arr[i]==key ){
                return i;
            }
            
        }
        return -1;
}

    public static void main(String[] args) {
        int arr[]={2,4,6,8,10,12,14,16};
        int key=10;

        int index = LinearSearch(arr, key);
        if(index==-1){
            System.out.println("Not Found");
        }else{
            System.out.println("key in indedx: " +index); 
        }
    }
}
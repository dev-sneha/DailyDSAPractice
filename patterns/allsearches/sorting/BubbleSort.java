class BubbleSort{
    public static void bubbleSort(int sort[]){
        for(int i =0;i<sort.length-1;i++){
            for(int j=0;j<sort.length-i-1;j++){
                if(sort[j]>sort[j+1]){
                    int temp= sort[j];
                    sort[j] = sort[j+1];
                    sort[j+1]=temp;
                }
            }
            
        }
        for(int i =0;i<sort.length;i++){
                System.out.println("sorted array: " + sort[i]);
            }
          
    }


    public static void main(String[] args) {
        int sort[]={5,4,1,3,2};
        bubbleSort(sort);
    }

}
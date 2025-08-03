class StaircaseSearch{
    public static Boolean findKey(int matrix[][], int key){
        int row=0 , column = matrix[0].length-1;

        while(row < matrix.length && column>=0){
        if(matrix[row][column]==key){
            System.out.print("found key at : (" + row + ", "+ column +  ")");
            return true;
        }
        else if(key < matrix[row][column]){
            column--;
        }
        else{
            row++;
        }

        }

        // (n-1,0)key <cell  = top 
        //key>cellvalue= right
        // (0,m-1)key <cell  = left 
        //key>cellvalue= bottom
        
        System.out.println("not found");
        return false;

    }


    public static void main(String[] args) {
        int key = 14;
         int matrix[][]= {{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
                        System.out.print(findKey(matrix, key));
    }
}
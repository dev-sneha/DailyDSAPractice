class TransposedMatrix{



    public static void main(String[] args) {
        int row=2, column=3;
        int[][] matrix= { {2,3,7}, 
                          {5,6,7} };


        int[][] transpose = new int[column][row];
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                transpose[j][i] = matrix[i][j];
            }
        }
       
        for (int i=0; i<transpose.length; i++){
            for(int j=0;j<transpose[0].length;j++){
                 System.out.print(transpose[i][j]+ " ");

            }
            System.out.println();
        }
    }
}
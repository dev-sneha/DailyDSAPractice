class TillingProblem{

     public static int tillingProblem(int n){// 2*n floor size

     if(n ==0 || n==1){
        return 1;
     }

     int fn1= tillingProblem(n-1);
     int fn2= tillingProblem(n-2);
      int totalWays = fn1+fn2;
      return totalWays;



     }


    public static void main(String[] args) {

        System.out.println(tillingProblem(3));
        
    }
}
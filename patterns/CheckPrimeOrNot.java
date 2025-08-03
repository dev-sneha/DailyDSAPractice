
class CheckPrimeOrNot{

    public static boolean isPrime(int n) {
           for(int i=2; i<= n-1; i++){
            if(n%i==0){
                return  false;
            }
        }
        return true;

    }
         //if i want to print all the prime no in range then we do it like 

         public static void printRange(int n){
            for(int i = 2;i<=n;i++){
                if(isPrime(i)){
                    System.out.print(" "+ i);
            
            }
           
            }
         }
        
    public static void main(String[] args) {
        printRange(5);
        
    }
}

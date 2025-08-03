class Factorial{

// iterative
    // public static int fact(int n){
    //     int result= 1;
    //     for(int i= 2;i <=n;i++){
    //         result = result *i;

    //     }
    //     return result;

    // }


    //recursive
    public static int fact(int n){
        if(n==0||n==1){
            return 1;
        }
        return n* fact(n-1);
    }   



    public static void main(String[] args) {
        int n= 5;
        System.out.println(fact(n));
    }
}
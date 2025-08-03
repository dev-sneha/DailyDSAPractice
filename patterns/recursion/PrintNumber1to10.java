class PrintNumber1to10
{

    public static void count(int n){
        if(n==1){
            System.out.println(n);
            return;
        }

        System.out.println(n+ " ");
        count(n-1);
    }
    public static void main(String[] args) {
        int n=10;

        count(n);
        
    }

}
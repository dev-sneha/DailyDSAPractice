class CheckPalindrome{

    public static boolean  palindrome(int n) {
        int palindrome = n;
       int reverse = 0;
       
       while(n!=0){
       int reminder = n% 10 ;
       reverse = reverse * 10+ reminder;
       n = n/10;

       } 

        return palindrome==reverse;
       
    }
    public static void main(String[] args) {
     
        if(palindrome(101)){

            System.out.println("it is palindrome");
        }
        else{
            System.out.println("not ");
        }
        
    }
}
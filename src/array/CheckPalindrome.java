public class CheckPalindrome {

    //Given a string s, check if it's a palindrome (reads the same forward and backward). Ignore non-alphanumeric characters and case.
    //Input: "A man, a plan, a canal: Panama"
    //Output: true

    public static void main(String[] args){
        System.out.println(isPalindrome("race a car")); // false
        System.out.println(isPalindrome(""));
    }

    public static boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left = s.length()-1, right = 0;

        while(left>right){
            if(s.charAt(right)!=s.charAt(left)){
                return false;
            }
            left--;
            right++;
        }
        return true;
    }

}

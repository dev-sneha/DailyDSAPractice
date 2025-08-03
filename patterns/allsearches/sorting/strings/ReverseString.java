class ReverseString{


    public static void main(String[] args) {
        String s = "hello";
        String reverse = " ";
        for(int i=0;i<s.length();i++){
            reverse = s.charAt(i) + reverse;
        }
        System.out.println(reverse);
    }
}
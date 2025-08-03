class HowManyTimeChAppear{
    

    public static  int countChar(String s, char c) {

        int count =0;
        for(int i =0;i<s.length();i++){
            if(c == s.charAt(i)){
                count++;
            }
        }
        return count;




    }

    public static void main(String[] args) {
        String s = "helllllo";
        char ch = 'l';
        System.out.print(countChar(s,ch));


    }
}
class PrintSubString{

    public static String substring(String str , int si, int ei){
        String subStr="";
        for(int i=si; i<ei ;i++){
            subStr+= str.charAt(i);

        }
        return  subStr;

    }
    public static void main(String[] args) {
        String str= "abcabcbb";
         System.out.println(substring(str, 0, 7));
        // System.out.println(str.substring(0,6));
        
    }
}
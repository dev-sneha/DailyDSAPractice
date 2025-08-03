
import java.util.Arrays;

class AnagramString{

    public static void main(String[] args) {
        String str= "race";
        String str1= "care";

       str=  str.toLowerCase();
       str1= str1.toLowerCase();

       if(str.length()== str1.length()){
        char[] strArr1 = str.toCharArray();
        char[] strArr2 = str1.toCharArray();

        Arrays.sort(strArr1);
        Arrays.sort(strArr2);

        Boolean result = Arrays.equals(strArr1, strArr2);
        if(result){
            System.out.println(str + " and " + str1 + " this is an anagram");
        }
        else{
            System.out.print(str + " and " + str1 + " this is not an  anagram");

        }
       

    }
    else {
        System.out.print(str + " and " + str1 + " this is not an  anagram");


    }
}
}
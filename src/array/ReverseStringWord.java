public class ReverseStringWord {

    public static void main(String[] args) {
        String input = "the sky is blue";
        System.out.println(reverseWords(input)); // Output: "the sky is blue"
    }


    public static String reverseWords(String s){

        String []words = s.split(" ");
        StringBuilder reverse = new StringBuilder();
         for(int i=words.length-1 ; i>=0;i--){
             reverse.append(words[i]);
             if(i>0){
                 reverse.append(" ");
             }

         }
        return reverse.toString();


    }
}

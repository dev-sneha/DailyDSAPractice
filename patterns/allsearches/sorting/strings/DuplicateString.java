class DuplicateString{

    public static void main(String[] args) {
        String s = "programming";
        String result = "";

        for(int i=0;i<s.length();i++){
            char current = s.charAt(i);
            boolean isDuplicate = false;

            for(int j=0;j<result.length();j++){
                if(result.charAt(j) == current){
                   isDuplicate= true;
                   break;
                }
            }
            if (!isDuplicate) {
                result = result + current; // Append if not duplicate
            }


        }
        System.out.println("Original: " + s);
        System.out.println("Without Duplicates: " + result);
    
    }
}
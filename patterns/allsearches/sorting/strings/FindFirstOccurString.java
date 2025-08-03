class FindFirstOccurString{


    public static void main(String[] args) {
        String s ="ssneha";
      

        for(int i =0;i<s.length();i++){
              boolean temp = true;
            for(int j=0;j<s.length();j++){
                if(i!=j && s.charAt(i)== s.charAt(j)){
                    temp= false;
                    break;

                }

            }
            if(temp){
            System.out.print(s.charAt(i));
            return;
                
            }
         
        }
           

    }
}
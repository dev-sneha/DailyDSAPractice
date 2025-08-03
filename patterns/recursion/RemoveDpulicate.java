

class RemoveDpulicate{

    public static void remove(String s, int indx, StringBuilder newstr,boolean map[]){
        if(indx== s.length()){
            System.out.println(newstr);
            return;
        }

        char currentValue = s.charAt(indx);

        if (map[currentValue -'a']== true){
        remove(s, indx+1, newstr, map);
        }
          else {
            map[currentValue -'a'] = true;
            remove(s, indx+1, newstr.append(currentValue), map);
        }
       

    }


    public static void main(String[] args) {

        String s = "aaapnacccolleeddgee";
        remove(s, 0, new StringBuilder(""), new boolean[26]);
        
    }
}
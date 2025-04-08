import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharcters {

    public static void main(String[] args) {
        //Given a string s, find the length of the longest substring without repeating characters.
        //Input: s = "abcabcbb"
        //Output: 3 ("abc")

        //We are using a sliding window technique with two pointers (left and right) and a HashSet to track unique characters.

        String s = "aabbccddeeff";

        System.out.println(lengthOfLongestSubstring(s));
        }
        public static int lengthOfLongestSubstring (String s){

            int left = 0, maxLength = 0;
            HashSet<Character> set = new HashSet<>();

            for (int right = 0; right < s.length(); right++) {
                while (set.contains(s.charAt(right))) {
                    set.remove(s.charAt(left));
                    left++;
                }
                set.add(s.charAt(right));
                maxLength = Math.max(maxLength, right - left + 1);


            }
            return maxLength;

        }



}

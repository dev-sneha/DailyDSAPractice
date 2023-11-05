package array;

public class ReverseStringArray {

    public static String reverseString(String input) {
        // Convert the string to a character array
        char[] charArray = input.toCharArray();

        // Initialize pointers for swapping
        int left = 0;
        int right = charArray.length - 1;

        // Swap characters from both ends towards the center
        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }

        // Convert the character array back to a string
        String reversedString = new String(charArray);
        return reversedString;
    }

    public static void main(String[] args) {
        String originalString = "Hello World!";
        String reversedString = reverseString(originalString);

        System.out.println("Original String: " + originalString);
        System.out.println("Reversed String: " + reversedString);
    }
}

import java.util.Arrays;

public class RemoveDuplicateUsingStream {
    public static void main(String[] args) {
        //Input: [5, 1, 3, 5, 2, 3, 1]
        //Output: [1, 2, 3, 5]

        int[] arr = {1, 1, 2};

        int[] sortedUniqueArray = Arrays.stream(arr).sorted().distinct().toArray();
        System.out.println("Sorted array without duplicates: " + Arrays.toString(sortedUniqueArray));

    }
}

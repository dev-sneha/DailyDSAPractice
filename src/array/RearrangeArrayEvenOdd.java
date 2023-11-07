package array;

public class RearrangeArrayEvenOdd {



        public static void rearrangeArray(int[] arr) {
            int left = 0;
            int right = arr.length - 1;

            while (left < right) {
                // Find the first odd number from the left
                while (arr[left] % 2 == 0 && left < right) {
                    left++;
                }

                // Find the first even number from the right
                while (arr[right] % 2 != 0 && left < right) {
                    right--;
                }

                // Swap the odd and even numbers
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }

        public static void main(String[] args) {
            int[] inputArray = {10, 7, 3, 8, 12, 5, 1, 4};

            System.out.println("Input Array:");
            for (int num : inputArray) {
                System.out.print(num + " ");
            }

            rearrangeArray(inputArray);

            System.out.println("\nOutput Array:");
            for (int num : inputArray) {
                System.out.print(num + " ");
            }
        }
    }




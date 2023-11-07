package array;

public class CountOccurrences {


        public static int countOccurrences(int[] arr, int x) {
            int firstOccurrence = findFirstOccurrence(arr, x);
            int lastOccurrence = findLastOccurrence(arr, x);

            if (firstOccurrence != -1 && lastOccurrence != -1) {
                return lastOccurrence - firstOccurrence + 1;
            } else {
                return 0;
            }
        }

        private static int findFirstOccurrence(int[] arr, int x) {
            int low = 0;
            int high = arr.length - 1;

            while (low <= high) {
                int mid = (low + high) / 2;

                if (arr[mid] == x && (mid == 0 || arr[mid - 1] != x)) {
                    return mid;
                } else if (arr[mid] < x) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }

            return -1;
        }

        private static int findLastOccurrence(int[] arr, int x) {
            int low = 0;
            int high = arr.length - 1;

            while (low <= high) {
                int mid = (low + high) / 2;

                if (arr[mid] == x && (mid == arr.length - 1 || arr[mid + 1] != x)) {
                    return mid;
                } else if (arr[mid] > x) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }

            return -1;
        }

        public static void main(String[] args) {
            int[] arr = {1, 2, 2, 2, 3, 4, 4, 5, 5, 5};
            int x = 2;
            int occurrences = countOccurrences(arr, x);
            System.out.println("Occurrences of " + x + " in the array: " + occurrences);
        }
    }




import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Stores a random array.
        int[] originalArray = getRandomArray(20);

        // Prints originalArray.
        System.out.println("Original Array -> " + Arrays.toString(originalArray));

        // Stores array having elements sorted in descending order.
        int[] sortedArray = sortArrayInDecreasingOrderI(originalArray);

        // Prints sortedArray
        System.out.println("Sorted Array -> " + Arrays.toString(sortedArray));

        // Stores array having elements sorted in descending order.
        int[] sortedArrayII = sortArrayInDecreasingOrderII(originalArray);

        // Prints sortedArrayII.
        System.out.println("Sorted Array -> " + Arrays.toString(sortedArrayII));
    }

    /**
     * Returns a random integer array of the provided length.
     */
    public static int[] getRandomArray(int length) {
        int[] randomArray = new int[length];

        // Filling up randomArray with random values.
        Random random = new Random();
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = random.nextInt(100);
        }
        return randomArray;
    }

    /**
     * Sorts an integer array elements to decreasing order.
     */
    public static int[] sortArrayInDecreasingOrderI(int[] array) {
        // Stores the sorted elements.
        int[] originalArray = Arrays.copyOf(array, array.length);
        // Sorting intArray in increasing order.
        Arrays.sort(originalArray);

        // Stores 20 integers in descending order.
        int[] decIntArray = new int[originalArray.length];
        StringBuilder builder = new StringBuilder();

        // Adding elements of intArray in decreasing order to builder.
        for (int i = originalArray.length - 1; i >= 0; i--) {
            builder.append(originalArray[i]).append(" ");
        }
        String[] intermediateArray = builder.toString().split(" ");

        // Parsing intermediateArray elements from String to int.
        for (int i = 0; i < intermediateArray.length; i++) {
            decIntArray[i] = Integer.parseInt(intermediateArray[i]);
        }
        return decIntArray;
    }

    /**
     * Sorts an integer array elements to decreasing order.
     */
    public static int[] sortArrayInDecreasingOrderII(int[] array) {
        // Stores the sorted elements.
        int[] originalArray = Arrays.copyOf(array, array.length);

        // Used for swapping elements.
        int temp;

        // Stores the length of originalArray.
        int length = originalArray.length;

        do {
            for (int i = 0; i < length; i++) {
                // Checks if there is a next element available to check.
                if (i + 1 <= length - 1) {
                    // Checks if the next element is greater.
                    if (originalArray[i] < originalArray[i + 1]) {
                        // Swapping
                        temp = originalArray[i];
                        originalArray[i] = originalArray[i + 1];
                        originalArray[i + 1] = temp;
                    }
                }
            }

            // Decreasing length count by 1.
            length--;
        } while (length != 1);

        return originalArray;
    }
}
package io.matheusvictor;

/**
 * O(log n)
 */
public class BinarySearch {
    public static BinarySearchResult binarySearch(int[] vector, int choice) {
        int count = 0;
        boolean found = false;
        int start = 0;
        int end = vector.length - 1;
        int middle = 0;

        while (start <= end) {
            count++;
            middle = (start + end) / 2;

            if (vector[middle] == choice) {
                found = true;
                break;
            } else if (vector[middle] < choice) {
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        }

        return new BinarySearchResult(middle, vector[middle], vector.length, count, found);
    }

}

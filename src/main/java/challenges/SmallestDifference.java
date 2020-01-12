/*
Challenge: Given two arrays of integers, calculate the smallest non-negative difference
that can be made choosing one element from each array.
 */

package challenges;

import java.util.Arrays;

public class SmallestDifference {

    public int smallestDifference(int[] array1, int[] array2) {

        validateInput(array1, array2);

        int[] sortedArray;
        int[] unsortedArray;

        // sort the smaller array
        if (array1.length < array2.length) {
            sortedArray = sort(array1);
            unsortedArray = array2;
        } else {
            sortedArray = sort(array2);
            unsortedArray = array1;
        }

        int smallestDifference = Integer.MAX_VALUE;
        for (int number: unsortedArray) {
            smallestDifference = Math.min(smallestDifference, smallestDifference(number, sortedArray));
        }
        return smallestDifference;
    }

    private void validateInput(int[] array1, int[] array2) {
        checkNullOrEmpty(array1);
        checkNullOrEmpty(array2);
    }

    private void checkNullOrEmpty(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Input cannot be null");
        }
        if (array.length == 0) {
            throw new IllegalArgumentException("Input cannot have length of 0");
        }
    }

    private int[] sort(int[] array) {
        int[] copy = Arrays.copyOf(array, array.length);
        Arrays.sort(copy);
        return copy;
    }

    private int smallestDifference(int number, int[] sortedArray) {
        return smallestDifference(number, sortedArray, 0, sortedArray.length - 1);
    }

    private int smallestDifference(int number, int[] sortedArray, int lo, int hi) {
        int mid = getMid(lo, hi);

        if (mid == lo) {
            return checkNeighborsForSmallestDiff(number, sortedArray, mid);
        }

        if (number == sortedArray[mid]) {
            return 0;
        }

        if (number > sortedArray[mid]) {
            return smallestDifference(number, sortedArray, mid + 1, hi);
        }

        return smallestDifference(number, sortedArray, lo, mid - 1);

    }

    private int getMid(int lo, int hi) {
        return (lo + hi) / 2;
    }

    private int checkNeighborsForSmallestDiff(int number, int[] sortedArray, int mid) {
        int smallestDifference = Math.abs(number - sortedArray[mid]);
        if (mid - 1 >= 0) {
            smallestDifference = Math.min(smallestDifference, Math.abs(number - sortedArray[mid - 1]));
        }
        if (mid + 1 < sortedArray.length) {
            smallestDifference = Math.min(smallestDifference, Math.abs(number - sortedArray[mid + 1]));
        }
        return smallestDifference;
    }

}
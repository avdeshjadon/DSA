package ARRAY.TwoPointer;

import ARRAY.Basics.ArrayBoilerplate;

public class EvenOddPartitionAndSorting {

    // Swap Method
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Print Method
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void evenOddPartition(int[] arr) {

        int left = 0;
        int right = arr.length - 1;

        // Step 1: Even first, Odd later
        while (left < right) {

            if (arr[left] % 2 != 0 && arr[right] % 2 == 0) {
                swap(arr, left, right);
            }

            if (arr[left] % 2 == 0) {
                left++;
            }

            if (arr[right] % 2 != 0) {
                right--;
            }
        }

        // Step 2: Find boundary between even and odd
        int boundary = 0;

        while (boundary < arr.length && arr[boundary] % 2 == 0) {
            boundary++;
        }

        // Step 3: Sort even part
        for (int i = 0; i < boundary - 1; i++) {
            for (int j = i + 1; j < boundary; j++) {
                if (arr[i] > arr[j]) {
                    swap(arr, i, j);
                }
            }
        }

        // Step 4: Sort odd part
        for (int i = boundary; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    swap(arr, i, j);
                }
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = ArrayBoilerplate.inputArray();

        evenOddPartition(arr);

        printArray(arr);
    }
}
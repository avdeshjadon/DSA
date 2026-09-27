package ARRAY.TwoPointer;

import ARRAY.Basics.ArrayBoilerplate;

public class EvenOddPartition {

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
    }

    public static void main(String[] args) {

        int[] arr = ArrayBoilerplate.inputArray();

        evenOddPartition(arr);

        printArray(arr);
    }
}
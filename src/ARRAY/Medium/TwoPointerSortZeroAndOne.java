package ARRAY.Medium;

import ARRAY.Basics.ArrayBoilerplate;

public class TwoPointerSortZeroAndOne {

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

    // Two Pointer Method
    public static void twoPointerSortZero(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            if (arr[left] == 0) {
                left++;
            }
            else if (arr[right] == 1) {
                right--;
            }
            else {
                swap(arr, left, right);
                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = ArrayBoilerplate.inputArray();

        twoPointerSortZero(arr);

        printArray(arr);
    }
}
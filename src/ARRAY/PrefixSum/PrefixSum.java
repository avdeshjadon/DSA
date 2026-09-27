package ARRAY.PrefixSum;

import ARRAY.Basics.ArrayBoilerplate;

public class PrefixSum {

    // Print Method
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int[] makePrefixSum(int[] arr) {
        int n = arr.length;
        int[] prefArr = new int[n];

        prefArr[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefArr[i] = prefArr[i - 1] + arr[i];
        }
        return prefArr;
    }

    public static void main(String[] args) {
        int[] arr = ArrayBoilerplate.inputArray();
        int[] ans = makePrefixSum(arr);
        printArray(ans);

    }
}

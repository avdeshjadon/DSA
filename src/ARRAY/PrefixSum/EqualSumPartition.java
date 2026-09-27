package ARRAY.PrefixSum;

import ARRAY.Basics.ArrayBoilerplate;

public class EqualSumPartition {

    public static boolean equalSumPartion(int[] arr) {

        int totalSum = 0;

        // Calculate total sum
        for (int i = 0; i < arr.length; i++) {
            totalSum += arr[i];
        }

        int prefixSum = 0;

        // Check every possible partition
        for (int i = 0; i < arr.length - 1; i++) {

            prefixSum += arr[i];

            int suffixSum = totalSum - prefixSum;

            if (prefixSum == suffixSum) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        int[] arr = ArrayBoilerplate.inputArray();

        System.out.println(equalSumPartion(arr));
    }
}
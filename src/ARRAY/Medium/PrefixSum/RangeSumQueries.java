package ARRAY.Medium.PrefixSum;

import ARRAY.Basics.ArrayBoilerplate;

import java.util.Scanner;

public class RangeSumQueries {

    public static int rangeSumQueries(int[] arr, int left, int right) {

        int n = arr.length;

        int[] prefix = new int[n];

        prefix[0] = arr[0];

        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        if (left == 1) {
            return prefix[right - 1];
        }

        return prefix[right - 1] - prefix[left - 2];
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = ArrayBoilerplate.inputArray();

        System.out.print("Enter left index of array : ");
        int left = sc.nextInt();

        System.out.print("Enter right index of array : ");
        int right = sc.nextInt();

        int ans = rangeSumQueries(arr, left, right);

        System.out.print(
                "Sum of array from index " + left +
                        " to index " + right +
                        " is " + ans
        );
    }
}
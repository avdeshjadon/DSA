package ARRAY.Medium;

import ARRAY.Basics.ArrayBoilerplate;

import java.util.Scanner;

public class RotateArrayByKSteps {

    public static int[] rotateArrayByKSteps(int[] array, int k) {

        int n = array.length;
        k = k % n;

        int j = 0;
        int[] result = new int[n]; // new array created so extra space is used in next question we will use better approach

        for (int i = n - k; i < n; i++) {
            result[j++] = array[i];
        }

        for (int i = 0; i < n - k; i++) {
            result[j++] = array[i];
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = ArrayBoilerplate.inputArray();

        System.out.print("Enter the number you want to rotate: ");
        int k = sc.nextInt();

        int[] result = rotateArrayByKSteps(arr, k);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

    }
}
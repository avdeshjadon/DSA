package ARRAY.Medium;

import ARRAY.Basics.ArrayBoilerplate;

import java.util.Scanner;

public class RotateArrayByKStepsWUES {

    //  Print Methode
    public static void PrintArray(int[] arr){
       for(int i=0;i<arr.length;i++){
           System.out.print(arr[i]+" ");
       }
    }

    // Swap Methode
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    //Reverse Methode
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }

    }

    // Rotate Methode
    public static void rotateArrayByKStepsWUES(int[] arr, int k) {
        int n = arr.length;

        k = k % n;

        reverse(arr, 0, n - k - 1);
        reverse(arr, n - k, n - 1);
        reverse(arr, 0, n - 1);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = ArrayBoilerplate.inputArray();

        System.out.print("Enter the number you want to rotate: ");
        int k = sc.nextInt();

        rotateArrayByKStepsWUES(arr, k);
        PrintArray(arr);

    }
}

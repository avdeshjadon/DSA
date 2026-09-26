import ARRAY.Basics.ArrayBoilerplate;

import java.util.Scanner;

public class RoughBook {

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


    public static void roughBook(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            if (arr[left] % 2 != 0 && arr[right] % 2 == 0) {
                swap(arr, left, right);
            }
            if(arr[left]%2==0){
                left++;
            }
            if(arr[left]%2!=0){
                right--;
            }

        }


    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = ArrayBoilerplate.inputArray();

        roughBook(arr);
        printArray(arr);



    }
}
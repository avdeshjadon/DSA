package ARRAY.Basics;

import java.util.Scanner;

public class ArrayBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array : ");
        int arrayLength = sc.nextInt();

        int[] arr = new int[arrayLength];

        System.out.print("Enter the elements in the array : ");
        for (int i = 0; i < arrayLength; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the elements in the array : ");
        for (int i = 0; i < arrayLength; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
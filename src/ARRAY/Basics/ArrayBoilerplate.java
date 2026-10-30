package ARRAY.Basics;

import java.util.Scanner;

public class ArrayBoilerplate {

    static Scanner sc = new Scanner(System.in);

    public static int[] inputArray() {

        System.out.print("Enter the number of elements in the array : ");
        int arrayLength = sc.nextInt();

        int[] arr = new int[arrayLength];

        System.out.print("Enter the elements in the array : ");

        for (int i = 0; i < arrayLength; i++) {
            arr[i] = sc.nextInt();
        }

        return arr;
    }

    public static int[][] TwoDInputArray() {

        System.out.print("Enter the number of rows in the array : ");
        int rowLength = sc.nextInt();

        System.out.print("Enter the number of columns in the array : ");
        int columnLength = sc.nextInt();

        int[][] arr = new int[rowLength][columnLength];

        System.out.println("Enter the elements in the array ");

        for (int i = 0; i < rowLength; i++) {
            System.out.print("Enter all the elements of " + (i + 1) + " row : ");

            for (int j = 0; j < columnLength; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        return arr;
    }

    public static int[][][] TwoDInputTwoArrays() {

        System.out.println("Enter the first matrix : ");
        int[][] arr1 = TwoDInputArray();

        System.out.println("\nEnter the second matrix : ");
        int[][] arr2 = TwoDInputArray();

        return new int[][][]{arr1, arr2};
    }
}
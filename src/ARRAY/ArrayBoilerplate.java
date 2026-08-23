package ARRAY;

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
}
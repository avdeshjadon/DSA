package ARRAY.Medium;

import ARRAY.Basics.ArrayBoilerplate;

import java.util.Scanner;

public class ElementIsPresentinAnArray {

    public static void checkElement(int[] arr, int num) {

        boolean flag = false;

        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] == num) {
                flag = true;
                break;
            }
        }
        if (flag == true) {
            System.out.println(num + " Present in the array");
        } else {
            System.out.println(num + " Not present in the array");
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int arr[] = ArrayBoilerplate.inputArray();

        System.out.print("Enter the number you want to check whether the element present in the array is: ");

        int num = sc.nextInt();
        checkElement(arr, num);
    }
}

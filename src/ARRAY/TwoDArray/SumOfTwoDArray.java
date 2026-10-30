package ARRAY.TwoDArray;

import ARRAY.Basics.ArrayBoilerplate;

public class SumOfTwoDArray {

    // printTwoDArray
    public static void printTwoDArray(int[][] arr) {

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }
    }

    public static void sumOfTwoDArray(int[][] arr1, int[][] arr2) {

        int rows1 = arr1.length;
        int cols1 = arr1[0].length;

        int rows2 = arr2.length;
        int cols2 = arr2[0].length;

        // Check whether addition is possible
        if (rows1 != rows2 || cols1 != cols2) {
            System.out.println("Wrong Input --> Addition not Possible");
            return;
        }

        // Create sum array
        int[][] sum = new int[rows1][cols1];

        // Addition
        for (int i = 0; i < rows1; i++) {

            for (int j = 0; j < cols1; j++) {
                sum[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        // Print result
        printTwoDArray(sum);
    }

    public static void main(String[] args) {

        int[][][] matrices = ArrayBoilerplate.TwoDInputTwoArrays();

        int[][] arr1 = matrices[0];
        int[][] arr2 = matrices[1];

        sumOfTwoDArray(arr1, arr2);
    }
}
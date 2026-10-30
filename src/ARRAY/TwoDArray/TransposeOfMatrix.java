package ARRAY.TwoDArray;

import ARRAY.Basics.ArrayBoilerplate;

public class TransposeOfMatrix {

    // printTwoDArray
    public static void printTwoDArray(int[][] arr) {

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }
    }

    public static int[][] transpose(int[][] arr) {
        int[][] transpose = new int[arr.length][arr[0].length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                transpose[j][i] = arr[i][j];
            }
        }
        return transpose;

    }

    public static void main(String[] args) {

        int [][] arr= ArrayBoilerplate.TwoDInputArray();
        System.out.println("Transpose of the matrix");

        int [][] ans= transpose(arr);
        printTwoDArray(ans);

    }
}
